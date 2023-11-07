package com.shopNest.customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.shopNest.dbHandler.DataInjector;


@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String uname=request.getParameter("uname");
		String mail=request.getParameter("mail");
		String pass=request.getParameter("pass");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		
		String status=DataInjector.addCustomer(uname, mail, pass, gender, address);
		
		response.sendRedirect("login.jsp");
	}
}

