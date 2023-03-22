package com.scheduler.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scheduler.scheduler.model.BookingRepository;

@SpringBootApplication
public class SchedulerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SchedulerApplication.class, args);
	}

}
