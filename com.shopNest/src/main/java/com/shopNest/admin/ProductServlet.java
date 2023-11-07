package com.shopNest.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.shopNest.dbHandler.DataInjector;


@WebServlet("/addP")
public class ProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("product-id"));
		String pname=request.getParameter("product-name");
		String pdesc=request.getParameter("product-description");
		int pprice=Integer.parseInt(request.getParameter("product-price"));
		String pimg=request.getParameter("product-image");
		
		DataInjector.addProduct(pid, pname, pdesc, pprice, pimg);
	}
}


