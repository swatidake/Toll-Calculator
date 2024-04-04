package com.fbs.vehicles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("1 : Two wheelers");
		System.out.println("2 : Three wheelers");
		System.out.println("3 : Four wheelers");
		System.out.println("4 : Heavy Vehicle");

		int choice = s.nextInt();
		Vehicle vehicle = null;
		int no;
		switch (choice) {

		case 1:
			System.out.println("How many  number of person: ");
			no = s.nextInt();
			vehicle = new TwoWheeler(no);
			vehicle.callToll();
			break;

		case 2:
			System.out.println("How many  number of person: ");
			no = s.nextInt();
			vehicle = new ThreeWheeler(no);
			vehicle.callToll();
			break;

		case 3:
			System.out.println("How many  number of person: ");
			no = s.nextInt();
			vehicle = new FourWheeler(no);
			vehicle.callToll();
			break;

		case 4:
			System.out.println("How many  number of person: ");
			no = s.nextInt();
			vehicle = new HeavyVehicle(no);
			vehicle.callToll();
			break;

		default:
			System.out.println("Invalid number entered! ");

		}

	}

}
