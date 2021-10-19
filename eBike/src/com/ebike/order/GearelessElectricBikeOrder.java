package com.ebike.order;

public class GearelessElectricBikeOrder extends Order {

	@Override
	public String orderDetails() {
		return "Ordering the GearLess Electric Bike";
	}

	@Override
	public int cost() {
		return 40;
	}

}
