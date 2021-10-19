package com.ebike.payment;

public class CashPaymentCommand implements Command{
	
	CashPayment cashPayment;

	public CashPaymentCommand(CashPayment cashPayment) {
		super();
		this.cashPayment = cashPayment;
	}

	@Override
	public void execute() {
		cashPayment.payAmount();
	}

}
