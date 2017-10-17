package com.practise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServletContext
 */
@WebServlet(description = "Servlet Context", urlPatterns = { "/DemoServletContext" })
public class DemoSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	PrintWriter out = response.getWriter();	
   String username = request.getParameter("queryparamname");
	HttpSession session = request.getSession();
	
	if(username != "" && username !=null)
		session.setAttribute("sessionusername", username);

	out.println("From Query param"+ username);
	out.print("From Session object " + (String) session.getAttribute("sessionusername"));
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
