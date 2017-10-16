package com.practise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class XmlServlet extends HttpServlet {

  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("usrname");
	    out.println("Hello "+ name);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//Getting params
		String name = request.getParameter("usrname");
		HttpSession session = request.getSession();
		if(!name.isEmpty())
		{
				
		    session.setAttribute("savedusername", name);
		}
		String fullname = request.getParameter("fullname");
		String profession = request.getParameter("prof");
		String[] location = request.getParameterValues("location");
		
	   
		//printing
		out.println("Hello "+ name+"  from the Post method ");
	    out.print("session name" + session.getAttribute("savedusername") );
	    out.println("Ur Full name <bold>"+fullname+"<bold>");
	    out.println("Ur profession is "+profession);
	    out.print("U selected "+ location.length+" places");
	    out.println("Places are ");
	    for(String places: location)
	    	out.print(places);
	    
	    
	}

}
