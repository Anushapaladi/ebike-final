package com.ebike.order;

public class GearedElectricBikeOrder extends Order{

	@Override
	public String orderDetails() {
		return "Ordering the Geared Bike";
	}

	@Override
	public int cost() {
		return 30;
	}

}
