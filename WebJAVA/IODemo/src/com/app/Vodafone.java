package com.app;

public class Vodafone implements Sim
{
	public Vodafone()
	{
		System.out.println("Vodafone Contructor Called..");
	}

	@Override
	public void calling() {
		System.out.println("Calling using vodafone sim");	
	}

	@Override
	public void data() {
		System.out.println("Browsing data using vodafone sim");	
	}
}
