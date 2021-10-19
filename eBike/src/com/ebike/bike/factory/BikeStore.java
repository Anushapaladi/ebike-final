package com.ebike.bike.factory;

public abstract class BikeStore {
	public Bike addBikeToStore(String bikeType, String bikeNo) {
		Bike newBike = createBike(bikeType, bikeNo);

		newBike.handleMaitanance();
		newBike.reFillEnergy();

		return newBike;
	}
	
	abstract Bike createBike(String bikeType, String bikeNo);
}
