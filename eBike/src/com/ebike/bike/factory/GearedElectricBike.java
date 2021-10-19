package com.ebike.bike.factory;

public class GearedElectricBike extends Bike {

	public GearedElectricBike(String bikeNo) {
		super(bikeNo, 4, 30, "Geared Electrc Bike");
	}

	@Override
	void reFillEnergy() {
		System.out.println("Re Charging the Battery");
	}

}
