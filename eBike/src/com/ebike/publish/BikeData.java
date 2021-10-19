package com.ebike.publish;

import com.ebike.bike.factory.Bike;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class BikeData extends Observable{
	private List<Bike> bikes = new ArrayList<Bike>();
	
	public void bikesUpdated(Bike bike) {
		System.out.println("Notifying that bike is available: " + bike.getBikeNo());
		setChanged();
		notifyObservers(bike);
	}

	public void addBike(Bike bike) {
		bikes.add(bike);
		bikesUpdated(bike);
	}
}
