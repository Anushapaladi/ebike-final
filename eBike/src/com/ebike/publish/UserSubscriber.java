package com.ebike.publish;

import java.util.Observable;
import java.util.Observer;

import com.ebike.bike.factory.Bike;

@SuppressWarnings("deprecation")
public class UserSubscriber implements Observer {
	Observable observable;	

	public UserSubscriber(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof BikeData) {
			Bike subScribedUserBike = (Bike) arg;
			System.out.println("Following is Avaiable for Ride: " + subScribedUserBike );
		}
	}

}
