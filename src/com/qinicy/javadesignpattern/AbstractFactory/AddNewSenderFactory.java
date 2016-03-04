package com.qinicy.javadesignpattern.AbstractFactory;

public class AddNewSenderFactory implements Provider{

	@Override
	public Sender createSender() {
		// TODO Auto-generated method stub
		return new AddNewSender();
	}

}
