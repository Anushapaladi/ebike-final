package com.ebike.bike.factory;

public class MainTestDriver {

	public static void main(String[] args) {
		
		System.out.println("Adding Bikes to the Store ");

		BikeStore gearedBikeStore = new GearedBikeStore();
		gearedBikeStore.addBikeToStore("ELECTRIC", "NSG 561");
		gearedBikeStore.addBikeToStore("NON_ELECTRIC", "NSG 231");

		BikeStore gearLessStore = new GearlessBikeStore();
		gearLessStore.addBikeToStore("ELECTRIC", "673 KLS");
		gearLessStore.addBikeToStore("NON_ELECTRIC", "621 KLS");
		
	}
}
