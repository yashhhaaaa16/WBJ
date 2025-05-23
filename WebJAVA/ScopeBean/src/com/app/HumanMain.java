package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanMain 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		{
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Human human = context.getBean("human",Human.class);
			Human human1 = context.getBean("human",Human.class);
			
			boolean status =(human==human1);
			System.out.println("Status= "+status);
			
			System.out.println("Memory location of human "+human);
			System.out.println("Memory location of human "+human1);
		}
	}
}
