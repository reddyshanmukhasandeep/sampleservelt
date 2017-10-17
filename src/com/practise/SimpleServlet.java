package com.practise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "my first Servlet", urlPatterns = { "/firstpage" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from Get Method");
		PrintWriter out = response.getWriter();
		int status = response.getStatus();
		out.print("<h3>Hello from Get Method</h3>");
		out.println(status);
	}
	public static void main(String[] args) {
		System.out.println("Hi Anu");
	}

}
