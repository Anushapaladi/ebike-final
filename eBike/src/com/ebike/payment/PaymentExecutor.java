package com.ebike.payment;

public class PaymentExecutor {
	
	String type;
	int amount;
	Command command = null;

	public PaymentExecutor(String type, int amount) {
		super();
		this.type = type;
		this.amount = amount;
	}

	public void payOrder() {
		if ("online".equals(type)) {
			OnlineTransfer onlineTransfer = new OnlineTransfer(amount);
			command = new OnlineTransferCommand(onlineTransfer);
		}
		else if ("cash".equals(type)) {
			CashPayment cashPayment = new CashPayment(amount);
			command = new CashPaymentCommand(cashPayment);
		}
		System.out.println("Payment is through: " + type);
		executeOrder();
	}
	
	void executeOrder() {
		if (command != null) {
			command.execute();
		} else {
			System.out.println("Not Supported Transaction");
		}
	}
}
