

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.*;
import java.sql.*;

/**
 * Servlet implementation class GetResult
 */
public class GetResult extends HttpServlet {
	String path = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String pass = "system";
	
	String query = "SELECT * FROM LOGIN WHERE ID=? AND PASSWORD=?";
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	PrintWriter pw;
	HttpSession hs;
			
	
	public void init()
	{
		try {
			Class.forName(path);
			con= DriverManager.getConnection(url,user,pass);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			String id = req.getParameter("id");
			String passw = req.getParameter("password");
			
			pw = res.getWriter();
			pst = con.prepareStatement(query);
			pst.setString(1, id);
			pst.setString(2, passw);
			rs = pst.executeQuery();
			
			if(rs.next())
			{
				
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String passwo = rs.getString(4);
				int mat = rs.getInt(5);
				int phy = rs.getInt(6);
				int che = rs.getInt(7);
				String pct = rs.getString(8);
				pw.println(id1+" "+name+" "+age+" "+passwo+" "+mat+" "+phy+" "+che+" "+pct);
				
				//creating a new Session
				hs= req.getSession(true);
				hs.setAttribute("mat", mat);
				hs.setAttribute("phy", phy);
				hs.setAttribute("che", che);
				
				req.getServletContext().getRequestDispatcher("/PrintPct").include(req, res);
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
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
	}
}












