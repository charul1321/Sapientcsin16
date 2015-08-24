package com.sapient.entities;

public class SeaPlane extends Aeroplane implements Sailer{
	public void land() {
		System.out.println("seaplane");
	}
	public void dock() {
		System.out.println("dock");
	}
		public void cruise() {
			System.out.println("cruise");
		}
}
