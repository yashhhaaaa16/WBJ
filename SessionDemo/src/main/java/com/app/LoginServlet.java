package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/servlet1")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		//
		
		String uname = request.getParameter("txtUsername");
		String pwd = request.getParameter("txtPassword");
		
		if(uname.equals("admin") && pwd.equals("admin123"))
		{
			pw.write("<br> Login Successfull "+uname);
			HttpSession session = request.getSession();
			session.setAttribute("name",uname);
			session.setAttribute("password", pwd);
			request.getRequestDispatcher("link.html").include(request, response);
		}
		else
		{
			pw.write("<br> Invalid username or password");
		
		request.getRequestDispatcher("login.html").include(request, response);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
