package com.shopNest.customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname= request.getParameter("username");
		String pass = request.getParameter("password");
		
		boolean val = Validator.isValid(uname,pass);
		
		//checking wheather the login detail is for admin
		if(val==true && uname.equals("admin"))
		{
			response.sendRedirect("admin.jsp");	
		}
		else if(val==true)
		{
			response.sendRedirect("home.jsp");	
		}
		else
		{
			response.sendRedirect("login.jsp");	
		}
	}

}
