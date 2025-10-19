package com.activities;

import java.util.ArrayList;
import java.util.Date;

public class Plane {
	
	private int maxPassengers;
	private ArrayList<String> passengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers=maxPassengers;
		this.passengers=new ArrayList<>();
	}
	
	public void onboard(String passengername) {
		if(passengers.size()<=maxPassengers) {
			this.passengers.add(passengername);
		} else {
			System.out.println("plane is full");
		}			
	}
	
	public Date takeOff() {
		this.lastTimeTookOf=new Date();
		return lastTimeTookOf;
	}
	
	public void land() {
		this.lastTimeLanded=new Date();
		this.passengers.clear();
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
	public ArrayList<String> getPassengers() {
		return passengers;
	}

}
