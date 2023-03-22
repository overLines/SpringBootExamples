package com.scheduler.scheduler;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


import com.scheduler.scheduler.model.Booking;
import com.scheduler.scheduler.model.BookingRepository;

@Configuration
@EnableScheduling
public class AlarmSchedulerBookings {
	
	final BookingRepository reporsitory = new BookingRepository(); 
	private final String filterForDelete = "DELETE";
	
	private static final Logger LOG = LoggerFactory.getLogger(AlarmSchedulerBookings.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	public AlarmSchedulerBookings() {
		//default for not bean error message
	}
	
	@Scheduled(fixedRate = 1000)
	public void run() {
		String time = dateFormat.format(new Date());
		LOG.info("The time is now { "+time+"}");
		final List<Booking> bookings = reporsitory.selectByState(filterForDelete);
		int listSize =  bookings.size();
		for(int i=0; i < listSize; i++) {
			reporsitory.delete(bookings.get(i).getId());
				LOG.info("Booking with ID {"+Integer.toString(bookings.get(i).getId())+"} is deleted");
			}
		}
	}
	

