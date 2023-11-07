

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;

/**
 * Servlet implementation class Login_Bank
 */
public class Login_Bank extends HttpServlet {
	String path = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String pass = "system";
	
	String query = "SELECT * FROM YES_BANK WHERE ACC_NO=? AND PASSWORD=?";
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	PrintWriter pw;
	
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
		try {
			String acc = req.getParameter("accno");
			String passw = req.getParameter("password");
			
			pw=res.getWriter();
			pst=con.prepareStatement(query);
			pst.setString(1, acc);
			pst.setString(2, passw);
			rs=pst.executeQuery();
			
			if(rs.next())
			{
				int acc1 = rs.getInt(1);
				String name = rs.getString(2);
				String passwo = rs.getString(3);
				String email = rs.getString(4);
				int bal = rs.getInt(5);
				pw.println(acc1+" "+name+" "+passwo+" "+email+" "+bal);	
			}
			else
			{
				res.sendRedirect("/Bank_Project/error.html");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void destroy()
	{
		try {
			con.close();
			pst.close();
			rs.close();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
















