package com.ebike.order;

public class GearelessNonElectricBikeOrder extends Order {

	@Override
	public String orderDetails() {
		return "Ordering the GearLess Bike";
	}

	@Override
	public int cost() {
		return 45;
	}

}
