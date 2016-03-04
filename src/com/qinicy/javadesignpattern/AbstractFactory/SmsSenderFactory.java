package com.qinicy.javadesignpattern.AbstractFactory;

public class SmsSenderFactory implements Provider{

	@Override
	public Sender createSender() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
