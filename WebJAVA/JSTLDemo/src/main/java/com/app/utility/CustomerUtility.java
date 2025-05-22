package com.app.utility;

import java.util.ArrayList;
import java.util.List;

import com.app.bean.Customer;

public class CustomerUtility {

	public static List<Customer> getCustomers()
	{
		List<Customer> l = new ArrayList<Customer>();
		l.add(new Customer("Rahul","Pawar","rahul@gmail.com",true));
		l.add(new Customer("Amit", "Sharma", "amit@gmail.com", true));
		l.add(new Customer("Priya", "Verma", "priya@gmail.com", false));
		l.add(new Customer("Vikram", "Desai", "vikram@gmail.com", true));
		l.add(new Customer("Neha", "Patil", "neha@gmail.com", false));
		l.add(new Customer("Arjun", "Mehta", "arjun@gmail.com", true));
		return l;
	}
}
