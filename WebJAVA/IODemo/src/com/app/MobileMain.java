package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {
	public static void main(String[] args) {
//		Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();

		/*
		 * Jio jio = new Jio(); jio.calling(); jio.data();
		 * 
		 * Sim sim = new Vodafone(); sim.calling(); sim.data();
		 */

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Jio v = context.getBean("jio", Jio.class);
		v.calling();
		v.data();

	}
}
