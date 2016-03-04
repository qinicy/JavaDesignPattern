package com.qinicy.javadesignpattern.AbstractFactory;

public class MailSenderFactory implements Provider{

	@Override
	public Sender createSender() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
