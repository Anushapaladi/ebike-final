package com.ebike.bike.factory;

public class GearlessElectricBike extends Bike{

	public GearlessElectricBike(String bikeNo) {
		super(bikeNo, 0, 30, "Gearless  Electric Bike");
	}
	
	@Override
	void reFillEnergy() {
		System.out.println("Re Charging the Battery");
	}


}
