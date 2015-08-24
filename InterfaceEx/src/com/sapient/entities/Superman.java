package com.sapient.entities;

public class Superman implements Flyer {

	@Override
	public void fly() {
		
			System.out.println("fly");
		// TODO Auto-generated method stub

	}

	@Override
	public void takeOff() {
		System.out.println("takeoff");
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		System.out.println("lands");
		// TODO Auto-generated method stub

	}
	public void leapBuilding() {
		System.out.println("leap building");
	}
	public void stopBullet() {
		System.out.println("stops bullet");
	}
}
