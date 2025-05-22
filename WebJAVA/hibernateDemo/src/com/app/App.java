package com.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

import com.app.entity.Student;

public class App {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		// Crate Session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create session
		
		Session session = factory.openSession();
		
		//brgin transaction
		
		session.beginTransaction();
		
		
     //----------------------------------------------------------------------------------//
		
		
		/*
		 * //save entity
		 * 
		 * Student st = new Student(); st.setFirstName("Yash");
		 * st.setLastName("Mundhe"); st.setEmail("yash@gmail.com"); session.persist(st);
		 */
		
		
	 //----------------------------------------------------------------------------------//
		
		
		/*
		 * //get entity on id
		 * 
		 * int id; System.out.println("Enter Student id : "); id = s.nextInt(); Student
		 * student = session.get(Student.class, id); System.out.println(student);
		 */
		
		 //----------------------------------------------------------------------------------//
		
		
		/*
		 * //update entity based on id
		 * 
		 * int id; System.out.println("Enter Student id : "); id = s.nextInt(); Student
		 * student = session.get(Student.class, id); System.out.println(student);
		 * student.setEmail("abc!@gmai.com"); System.out.println(student);
		 */
		
		 //----------------------------------------------------------------------------------//
		
		
		
		/*
		 * //delete student
		 * 
		 * int id; System.out.println("Enter Student id : "); id = s.nextInt(); Student
		 * student = session.get(Student.class, id); session.delete(student);
		 * System.out.println(student);
		 */
		
		 //----------------------------------------------------------------------------------//
		
			/*
			 * //list of student
			 * 
			 * Query query = session.createQuery("from Student"); List<Student> l =
			 * query.list(); l.forEach(x -> System.out.println(x));
			 * 
			 */
		
		
		 //----------------------------------------------------------------------------------//
		
		Query query = session.createQuery("from Student where lastName = :name");
		query.setParameter("name","pawar");
		List<Student> l = query.list();
		l.forEach(x -> System.out.println(x));
		
		
		
		//commit
		
		session.getTransaction().commit();
		
		//close session
		
		session.close();
		factory.close();
	}
}
