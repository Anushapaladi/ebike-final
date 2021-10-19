package com.ebike.bike.factory;

public class GearlessNonElectricBike extends Bike{

	public GearlessNonElectricBike(String bikeNo) {
		super(bikeNo, 0, 40, "Gearless Non Electric Bike");
	}

	@Override
	void reFillEnergy() {
		System.out.println("Re Filling the Gas");
	}


}
