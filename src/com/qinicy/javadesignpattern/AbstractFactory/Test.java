package com.qinicy.javadesignpattern.AbstractFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Provider mailSenderFactory = new MailSenderFactory();
		Sender mailSender = mailSenderFactory.createSender();
		mailSender.send();
		
		
		Provider addNewSenderFactory = new AddNewSenderFactory();
		Sender addNewSender = addNewSenderFactory.createSender();
		addNewSender.send();
		
	}

}
