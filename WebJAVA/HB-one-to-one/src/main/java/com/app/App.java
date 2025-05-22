package com.app;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		//Save 
		
		/*
		 * Instructor instructor = new Instructor(); InstructorDetails instructorDetails
		 * = new InstructorDetails(); instructor.setFirstName("Yash");
		 * instructor.setLastName("Mundhe"); instructor.setEmail("yash@gmail.com");
		 * instructorDetails.setYoutube_channel("yash.com");
		 * instructorDetails.setHooby("reading");
		 * instructor.setInstructorDetails(instructorDetails);
		 */
				
		/*
		 * InstructorDetails instructorDetails = new
		 * InstructorDetails("Springboot","singing"); Instructor instructor = new
		 * Instructor("Yash","Mundhe","yash@gmail.com",instructorDetails);
		 * session.persist(instructor);
		 */
		
		
		//GEt Instructor by id
		
		
		/*
		 * System.out.println("Enter instructor Id : "); int id = s.nextInt();
		 * Instructor instructor = session.get(Instructor.class, id);
		 * System.out.println(instructor);
		 */
		
		
		//Update 
		
		/*
		 * System.out.println("Enter instructor Id : "); int id = s.nextInt();
		 * Instructor instructor = session.get(Instructor.class, id);
		 * instructor.setEmail("yash123@gmail.com");
		 * instructor.getInstructorDetails().setYoutube_channel("singer.com");
		 * Instructor i = session.merge(instructor); System.out.println(i);
		 */
		 
		
		//Delete
		
		/*
		 * System.out.println("Enter instructor Id : "); int id = s.nextInt();
		 * Instructor instructor = session.get(Instructor.class, id);
		 * session.remove(instructor);
		 */
		
		//Display
		
		
		List<Instructor> l = session.createQuery("from Instructor").list();
		Predicate<Instructor> p = x -> x.getInstructorDetails().getHooby().equals("singing");
		
		l.forEach(x -> { if(p.test(x)) System.out.println(x);});
		 
		session.getTransaction().commit();
		s.close();
		session.close();
		sessionFactory.close();
	}
}
