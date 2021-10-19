package com.ebike.bike.factory;

public class GearlessBikeStore extends BikeStore{

	@Override
	Bike createBike(String bikeType, String bikeNo) {
		Bike bike = null;
		System.out.println("Creating " + bikeType + " Gearless Bike");
		if ("ELECTRIC".equals(bikeType)) {
			bike = new GearlessElectricBike(bikeNo);
		} else if ("NON_ELECTRIC".equals(bikeType)) {
			bike = new GearlessNonElectricBike(bikeNo);
		}
		return bike;
	}
}
