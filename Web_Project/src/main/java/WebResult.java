

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
import java.sql.Statement;

/**
 * Servlet implementation class WebResult
 */
public class WebResult extends HttpServlet {
	String path="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="system";
	
	String query="select * from student where name=? and password=?";
	
	Connection con = null;
	PreparedStatement pst = null;
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
		String name=req.getParameter("name");
		String passw=req.getParameter("password");
		try {
			pw=res.getWriter();
			res.sendRedirect("/Web_Project/login.html");
			pst=con.prepareStatement(query);
			pst.setString(1, name);
			pst.setString(2, passw);
			rs=pst.executeQuery();
			while(rs.next())
			{
				String name1=rs.getString("name");
				int age = rs.getInt("age");
				int m1=rs.getInt("mark_1");
				int m2=rs.getInt("mark2");
				int avg=rs.getInt("average");
				String passwo=rs.getString("password");
				pw.println(name1+" "+age+" "+m1+" "+m2+" "+avg+" "+passwo);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public void destroy()
	{
		
	}
	
}
