

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class PrintPct
 */
public class PrintPct extends HttpServlet {
	
	PrintWriter pw;
	HttpSession hs;
	
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			String id = req.getParameter("id");
			String passw = req.getParameter("password");
			
			pw = res.getWriter();
			// Getting Access to existing session
			
			hs=req.getSession();
			//Get the Data From session
			int mat= (int)hs.getAttribute("mat");
			int phy= (int)hs.getAttribute("phy");
			int che= (int)hs.getAttribute("che");

			//Calculating the percentage
			int sum=mat+phy+che;
			float per = (float)(sum/300.0F)*100;
			
			//Printing The Percentage
			pw.println("The Percentage is "+per);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
