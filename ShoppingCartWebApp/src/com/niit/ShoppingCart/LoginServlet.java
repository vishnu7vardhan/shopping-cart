package com.niit.ShoppingCart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDAO loginDAO;
       
   
    public LoginServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String UserID=request.getParameter("UserID");
		String Password=request.getParameter("Password");
		
	
		LoginDAO loginDAO = new LoginDAO();
	RequestDispatcher dispatcher;
	if(LoginDAO.isValidUser(UserID,Password)==true)
	{
		
		dispatcher=request.getRequestDispatcher("Home.html");
		dispatcher.forward(request,response);
	
	dispatcher=request.getRequestDispatcher("Login.html");
	dispatcher.forward(request,response);
	
	PrintWriter writer=response.getWriter();
	writer.println("please enter valid credentials");
	dispatcher=request.getRequestDispatcher("Login.html");
	dispatcher.include(request,response);
		
	}
		
		
	}

}
