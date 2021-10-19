package com.ebike.payment;

public class OnlineTransfer {
	
	int amount;

	public OnlineTransfer(int amount) {
		super();
		this.amount = amount;
	}

	void deductAmount() {
		if (amount > 0) {
			initiateTransaction();
			takingCredentialsSecurely();
			amountIsAvailableInAccount(amount);
			System.out.println("Amount Deducted: " + amount + "$" );
		}
	}

	void initiateTransaction() {
		System.out.println("The transaction initiated");
	}

	void takingCredentialsSecurely() {
		System.out.println("The Credentials are taken Securerly");
		validateCredentials();
	}

	void validateCredentials() {
		System.out.println("The Credentials are Validated");
	}

	void amountIsAvailableInAccount(int amount) {
		System.out.println("Amount " + amount + "$ is avaialble in the account");
	}
}
