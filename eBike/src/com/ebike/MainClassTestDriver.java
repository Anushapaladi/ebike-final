package com.ebike;

import com.ebike.bike.factory.Bike;
import com.ebike.bike.factory.BikeStore;
import com.ebike.bike.factory.GearedBikeStore;
import com.ebike.bike.factory.GearlessBikeStore;
import com.ebike.order.GearedElectricBikeOrder;
import com.ebike.order.Helmet;
import com.ebike.order.Insurance;
import com.ebike.order.Order;
import com.ebike.payment.PaymentExecutor;
import com.ebike.publish.BikeData;
import com.ebike.publish.UserSubscriber;

public class MainClassTestDriver {

	public static void main(String[] args) {

		System.out.println("--------------- Addition of Bikes to Store-------------------");

		// To Create Bikes into the Store using Factory Pattern so that it will be available for user to access the Bikes.
		BikeStore gearedBikeStore = new GearedBikeStore();
		Bike bike1 = gearedBikeStore.addBikeToStore("ELECTRIC", "NSG 561");
		Bike bike2 = gearedBikeStore.addBikeToStore("NON_ELECTRIC", "NSG 231");

		BikeStore gearLessStore = new GearlessBikeStore();
		Bike bike3 = gearLessStore.addBikeToStore("ELECTRIC", "673 KLS");
		Bike bike4 = gearLessStore.addBikeToStore("NON_ELECTRIC", "621 KLS");
		
		System.out.println("--------------- Notifying the Addition of Bikes-------------------");

		System.out.println("Bikes will be Notified to User");
		
		BikeData bikeSubject = new BikeData();
		new UserSubscriber(bikeSubject);
		
		// Now created bikes are added to BikeSubject, so that it will be notified to user using Observer pattern
		bikeSubject.addBike(bike1);
		bikeSubject.addBike(bike4);

		System.out.println("--------------- Booking the Bike Ride -------------------");
		Order orderBike = new GearedElectricBikeOrder();
		// On top of Adding the Bike user wants to add some Essentials such as Helmet, Insurance using the Decorator pattern
		orderBike = new Insurance(orderBike);
		orderBike = new Helmet(orderBike);

		System.out.println(orderBike.orderDetails());
		System.out.print("Total Cost: " + orderBike.cost() + "$.");
		
		
		System.out.println("--------------- Payment for Bike Ride -------------------");

		// Payment can be with any vendor of many types, encapsulate the payment option using the Command Pattern 
		PaymentExecutor paymentExecutor = new PaymentExecutor("online", orderBike.cost());
		
		paymentExecutor.payOrder();
		
		System.out.println("--------------- Order Palced Successfully.. Your Ride will be shared shortly -------------------");
		
		prepareOtherTest(bike2, bike3);
	}
	
	static void prepareOtherTest(Bike bike2, Bike bike3) {
		
		System.out.println("\n\n==========================The Other two bikes being added============================");
		
		System.out.println("--------------- Notifying the Addition of Bikes-------------------");

		System.out.println("Bikes will be Notified to User");
		
		BikeData bikeSubject = new BikeData();
		new UserSubscriber(bikeSubject);
		
		// Now created bikes are added to BikeSubject, so that it will be notified to user using Observer pattern
		bikeSubject.addBike(bike2);
		bikeSubject.addBike(bike3);

		System.out.println("--------------- Booking the Bike Ride -------------------");
		Order orderBike = new GearedElectricBikeOrder();
		// On top of Adding the Bike user wants to add some Essentials such as Insurance using the Decorator pattern
		orderBike = new Insurance(orderBike);

		System.out.println(orderBike.orderDetails());
		System.out.print("Total Cost: " + orderBike.cost() + "$.");
		
		
		System.out.println("--------------- Payment for Bike Ride -------------------");

		// Payment can be with any vendor of many types, encapsulate the payment option using the Command Pattern 
		PaymentExecutor paymentExecutor = new PaymentExecutor("cash", orderBike.cost());
		
		paymentExecutor.payOrder();
		
		System.out.println("--------------- Order Palced Successfully.. Your Ride will be shared shortly -------------------");
	}
}
