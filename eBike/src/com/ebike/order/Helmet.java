package com.ebike.order;

public class Helmet extends BikeEssentialsDecorator {

	Order order;

	public Helmet(Order order) {
		super();
		this.order = order;
	}

	@Override
	public String orderDetails() {
		return  order.orderDetails() + " ,Helemet ";
	}

	@Override
	public int cost() {
		return 1 + order.cost();
	}

}
