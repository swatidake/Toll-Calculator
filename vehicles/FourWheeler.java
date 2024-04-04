package com.fbs.vehicles;

public class FourWheeler extends Vehicle {

	public FourWheeler(int no_of_persons) {
		super(no_of_persons, 40);
		 
	}

	@Override
	public void callToll() {
		if (no_of_persons > 4) {
			total_toll = basic_toll + (no_of_persons - 4) * 40;
		} else {
			total_toll = basic_toll;
		}

		System.out.println("Total toll is: " + total_toll);

	}

}
