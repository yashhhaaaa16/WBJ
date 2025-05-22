package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.app.bean.Student;
import com.app.dao.StudentDAO;

/**
 * Servlet implementation class ResultServlet
 */

@WebServlet("/resultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultServlet() {
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
		int prn = Integer.parseInt(request.getParameter("txtPrn"));
		
		try {
		Student s = StudentDAO.getStudentbyPrn(prn);
		pw.write("<html><body><table border='1'>");
		pw.write("<tr><th>Prn</th><th>Name</th><th>Marks1</th><th>Marks2</th><th>marks3</th></tr>");
		pw.write("<tr><td>"+s.getPrn()+"</td>");
		pw.write("<td>"+s.getName()+"</td>");
		pw.write("<td>"+s.getS1()+"</td>");
		pw.write("<td>"+s.getS2()+"</td>");
		pw.write("<td>"+s.getS3()+"</td></tr>");
		pw.write("</table></body></html>");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
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
