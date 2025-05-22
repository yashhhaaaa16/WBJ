package com.app;

import jakarta.security.auth.message.callback.CallerPrincipalCallback;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import org.apache.catalina.filters.ExpiresFilter.XPrintWriter;

/**
 * Servlet implementation class ConfigServlet
 */

@WebServlet(urlPatterns = {"/serv1"}, initParams = {
		@WebInitParam(name = "principle", value = "10000"),
		@WebInitParam(name = "rate", value = "8"),
		@WebInitParam(name = "time", value = "3")
})
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   // private String uname, pwd;
	private int principle, rate, time;
    private ServletConfig servletConfig;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		servletConfig = getServletConfig();
		//uname = servletConfig.getInitParameter("Username");
		principle = Integer.parseInt(servletConfig.getInitParameter("principle"));
		rate = Integer.parseInt(servletConfig.getInitParameter("rate"));
		time = Integer.parseInt(servletConfig.getInitParameter("time"));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		/*
		 * Enumeration <String> e = servletConfig.getInitParameterNames();
		 * while(e.hasMoreElements()) { String str = e.nextElement();
		 * pw.print(str+" "+servletConfig.getInitParameter(str)+"<br>"); }
		 */
		
		pw.print(" Simple Interest - "+principle*time*rate);
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
