package com.fbs.vehicles;

public abstract class Vehicle {

	int no_of_persons;
	int total_toll;
	int basic_toll;
	

	public Vehicle(int no_of_persons, int basic_toll) {
		 this.no_of_persons= no_of_persons;
		 this.basic_toll=basic_toll;
		 
	}

	public int getNo_of_person() {
		return no_of_persons;
	}

	public void setNo_of_person(int no_of_person) {
		this.no_of_persons = no_of_person;
	}

	public int getTotal_toll() {
		return total_toll;
	}

	public void setTotal_toll(int total_toll) {
		this.total_toll = total_toll;
	}

	public int getBasic_toll() {
		return basic_toll;
	}

	public void setBasic_toll(int basic_toll) {
		this.basic_toll = basic_toll;
	}
	
	
	public abstract void callToll();
	
}
