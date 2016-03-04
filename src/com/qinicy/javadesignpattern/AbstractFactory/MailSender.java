package com.qinicy.javadesignpattern.AbstractFactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Send a message by mail!");	
	}

}
