package com.sapient.entities;

public class Airport {
	public static void main(String[] args)
	{
		Airport metropolisAirport= new Airport();
		Helicopter heli=new Helicopter();
		SeaPlane sea=new SeaPlane();
		metropolisAirport.getPermission(heli);
		
	}
 public void getPermission(Flyer f)
 {
	 f.land();
 }
}
