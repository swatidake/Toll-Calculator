package com.fbs.vehicles;

public class HeavyVehicle extends Vehicle {

	public HeavyVehicle(int no_of_persons) {
		super(no_of_persons, 100);
		 
	}

	@Override
	public void callToll() {
		if (no_of_persons > 6) {
			total_toll = basic_toll + (no_of_persons - 6) * 100;
		} else {
			total_toll = basic_toll;
		}

		System.out.println("Total toll is: " + total_toll);

	}

}
