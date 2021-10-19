package com.ebike.bike.factory;

public abstract class Bike {

	String bikeNo;
	int gears;
	int maxSpeed;
	String description;

	public Bike(String bikeNo, int gears, int maxSpeed, String description) {
		this.bikeNo = bikeNo;
		this.gears = gears;
		this.maxSpeed = maxSpeed;
		this.description = description;
	}

	public String getBikeNo() {
		return bikeNo;
	}

	void handleMaitanance() {
		System.out.println("Repairing Bike: " + bikeNo);
	}
	
	@Override
	public String toString() {
		return "Bike " + bikeNo + ", gears=" + gears + ", maxSpeed=" + maxSpeed + ", description=" + description;
	}

	abstract void reFillEnergy();
}
