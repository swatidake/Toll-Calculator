package com.fbs.vehicles;

public class ThreeWheeler extends Vehicle {

	public ThreeWheeler(int no_of_persons) {
		super(no_of_persons, 30);

	}

	@Override
	public void callToll() {
		if (no_of_persons > 3) {
			total_toll = basic_toll + (no_of_persons - 3) * 20;
		} else {
			total_toll = basic_toll;
		}

		System.out.println("Total toll is: " + total_toll);

	}

}
