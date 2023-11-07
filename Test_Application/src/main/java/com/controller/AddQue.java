package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.model.Model;

public class AddQue extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String question = request.getParameter("qus");
		String optionA = request.getParameter("optA");
		String optionB = request.getParameter("optB");
		
		if(question.length()==0  || optionA.length()==0 || optionB.length()==0)
		{
			response.sendRedirect("/Test_Application/adminlogin.jsp");
		}
		else
		{
			Model m = new Model();
			m.insert(request, response);
			response.sendRedirect("/Test_Application/success.jsp");
			
		}
	}

}
