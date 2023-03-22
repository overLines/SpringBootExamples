package com.scheduler.scheduler.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingRepository {

	List<Booking> listOfBookings;
	
	public BookingRepository() {
		
		listOfBookings = new ArrayList<Booking>();
		listOfBookings.add(new Booking(1,"DELETE"));
		listOfBookings.add(new Booking(2,"DELETE"));
		listOfBookings.add(new Booking(3,"ACCEPTED"));
		listOfBookings.add(new Booking(4,"ACCEPTED"));
		listOfBookings.add(new Booking(5,"DELETE"));
	}
	
	public List<Booking> selectByState(String string) {
		List<Booking> deleteOfBookings = new ArrayList<Booking>();  
		for(Booking currentBooking: listOfBookings) { 
			if(currentBooking.getState().equals("DELETE")) {
				deleteOfBookings.add(currentBooking);
			}
		}
	
		return deleteOfBookings;
	}

	public void delete(int id) {
		//output delete object 1 2 5 
		Iterator it = listOfBookings.iterator();
		while(it.hasNext()) {
				Booking b = (Booking) it.next();
			if(b.getId() == id) {
				it.remove();
			}
		}
	}
	
}
