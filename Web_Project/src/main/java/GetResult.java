

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;

/**
 * Servlet implementation class GetResult
 */
public class GetResult extends HttpServlet {
	String path="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="system";
	
	String query="select * from student";
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	PrintWriter pw = null; 

	
	public void init()
	{
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		try
		{
			pw=res.getWriter();
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next())
			{
				String name=rs.getString("name");
				int age = rs.getInt("age");
				pw.println(name+"  "+age+" ");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	public void destroy()
	{
		try
		{
			con.close();
			stmt.close();
			rs.close();
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


















