package com.scheduler.scheduler.model;

public class Booking {

	int id;
	String state;

	public Booking() {
		// default
	}

	public Booking(int id, String state) {
		this.id = id;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
