package com.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Model {
	
	String path = "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="system";
	
	String insert = "INSERT INTO test(question,option_A,option_B) values(?,?,?)";

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	PrintWriter pw = null;
	Statement smt;
	
	public Model()
	{
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(HttpServletRequest request, HttpServletResponse response)
	{
		String question = request.getParameter("qus");
		String optionA = request.getParameter("optA");
		String optionB = request.getParameter("optB");
		try {
			pw= response.getWriter();
			pst=con.prepareStatement(insert);
			pst.setString(1, question);
			pst.setString(2, optionA);
			pst.setString(3, optionB);
			pst.executeUpdate();
			System.out.println("Query Executed");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}












































