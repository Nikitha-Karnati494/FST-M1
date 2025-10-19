package com.activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane=new Plane(10);
		plane.onboard("nikki");
		plane.onboard("nikki2");
		plane.onboard("nikki3");
		System.out.println("Plane takes off "+plane.takeOff());
		System.out.println("People on the plane "+plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane landed on "+plane.getLastTimeLanded());
		System.out.println("people on the plane after landing "+plane.getPassengers());
	}

}
