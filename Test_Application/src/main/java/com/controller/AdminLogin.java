package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminLogin extends HttpServlet {
	
	String email="admin@gmail.com";
	String password = "admin2023";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			String email1 = request.getParameter("email");
			String password1 = request.getParameter("passwoed");
			
			if(email1.equals(email) || password1.equals(password))
			{
				response.sendRedirect("/Test_Application/addque.jsp");
			}
			else 
			{
				response.sendRedirect("/Test_Application/index.jsp");
			}


		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
