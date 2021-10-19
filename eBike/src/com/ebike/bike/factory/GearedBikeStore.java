package com.ebike.bike.factory;

public class GearedBikeStore extends BikeStore{

	@Override
	Bike createBike(String bikeType, String bikeNo) {
		Bike bike = null;
		System.out.println("Creating " + bikeType + " Geared Bike");
		if ("ELECTRIC".equals(bikeType)) {
			bike = new GearedElectricBike(bikeNo);
		} else if ("NON_ELECTRIC".equals(bikeType)) {
			bike = new GearedNonElectricBike(bikeNo);
		}
		return bike;
	}

}
