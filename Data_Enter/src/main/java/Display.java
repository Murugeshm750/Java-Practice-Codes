

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Display extends HttpServlet {
	// My Sql Path
	
	String mysql_path="com.mysql.cj.jdbc.Driver";
	String mysql_url="jdbc:mysql://localhost/login";
	String mysql_user="root";
	String mysql_pass="";
	
	// oracle Path
	/*
	String path = "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="system";
	*/
	String display = "select * from login_form where username=? and password=?"; 
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	PrintWriter pw = null;
	Statement smt;
	
	public void init()
	{
		try {
			Class.forName(mysql_path);
			con=DriverManager.getConnection(mysql_url, mysql_user, mysql_pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
	{
		String username=req.getParameter("username");
		String password = req.getParameter("password");
		
		try {
			pw=res.getWriter();
			pst=con.prepareStatement(display);
			pst.setString(1, username);
			pst.setString(2, password);
			rs=pst.executeQuery();
			
			if(rs.next())
			{
				String un=rs.getString(1);
				String email=rs.getString(2);
				String psw=rs.getString(3);
				
				pw.println(un+" "+email+" "+psw);
			}
			else
			{
				res.sendRedirect("/Data_Enter/error.html");
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
