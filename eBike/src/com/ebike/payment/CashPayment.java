package com.ebike.payment;

public class CashPayment {
	int amount;

	public CashPayment(int amount) {
		super();
		this.amount = amount;
	}

	void payAmount() {
		if (amount > 0) {
			System.out.println("Amount to be Paid: " + amount + "$" );
			System.out.println("Pay amount before ride starts");
		}
	}
}
