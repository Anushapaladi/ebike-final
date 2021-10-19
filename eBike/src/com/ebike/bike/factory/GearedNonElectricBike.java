package com.ebike.bike.factory;

public class GearedNonElectricBike extends Bike {

	public GearedNonElectricBike(String bikeNo) {
		super(bikeNo, 5, 40, "Geared Non Electric Bike");
	}

	@Override
	void reFillEnergy() {
		System.out.println("Re Fill the Gas");
	}

}
