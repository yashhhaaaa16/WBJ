package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.bean.Customer;
import com.app.utility.CustomerUtility;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerController
 */

@WebServlet("/customerServlet")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		List<Customer> list = CustomerUtility.getCustomers();
		request.setAttribute("list", list);
		
		//request.getRequestDispatcher("customerDetails.jsp").forward(request, response);
		//request.getRequestDispatcher("customerDetails1.jsp").forward(request, response);
		request.getRequestDispatcher("customerDetails3.jsp").forward(request, response);
		//request.getRequestDispatcher("customerDetails4.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
