package com.ebike.order;

public class Insurance extends BikeEssentialsDecorator {

	Order order;
	
	public Insurance(Order order) {
		super();
		this.order = order;
	}

	@Override
	public String orderDetails() {
		return order.orderDetails() +  " ,Insurance" ;
	}

	@Override
	public int cost() {
		return 1 + order.cost();
	}

}
