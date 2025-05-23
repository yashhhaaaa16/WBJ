package com.app;

public class Jio implements Sim
{
	public Jio()
	{
		System.out.println("Jio Contructor called");
	}

	@Override
	public void calling() {
		System.out.println("Calling using jio sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing data using jio sim");
	}

}
