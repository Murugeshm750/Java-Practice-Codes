

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Register extends HttpServlet {
	
	// My Sql Path
		
	String mysql_path="com.mysql.cj.jdbc.Driver";
	String mysql_url="jdbc:mysql://localhost/login";
	String mysql_user="root";
	String mysql_pass="";
	/*
	String path = "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="system";
	*/
	String insert = "insert into login_form (username,email,password) values (?,?,?)";
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	PrintWriter pw;
	
	public void init()
	{
		try {
			Class.forName(mysql_path);
			con=DriverManager.getConnection(mysql_url, mysql_user, mysql_pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		try {
			pw= res.getWriter();
			res.sendRedirect("/Data_Enter/register.html");
			pst=con.prepareStatement(insert);
			pst.setString(1, username);
			pst.setString(2, email);
			pst.setString(3, password);
			pst.executeUpdate();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








