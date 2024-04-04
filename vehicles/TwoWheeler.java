package com.fbs.vehicles;

public class TwoWheeler extends Vehicle {

	public TwoWheeler(int no_of_persons) {
		super(no_of_persons, 20);

	}

	@Override
	public void callToll() {

		if (no_of_persons > 2) {
			total_toll = basic_toll + (no_of_persons - 2) * 10;
		} else {
			total_toll = basic_toll;
		}

		System.out.println("Total toll is: " + total_toll);
	}

}
