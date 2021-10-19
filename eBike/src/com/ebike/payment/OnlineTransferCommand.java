package com.ebike.payment;

public class OnlineTransferCommand implements Command {

	OnlineTransfer onlineTransfer;

	public OnlineTransferCommand(OnlineTransfer onlineTransfer) {
		super();
		this.onlineTransfer = onlineTransfer;
	}

	@Override
	public void execute() {
		onlineTransfer.deductAmount();
	}
}
