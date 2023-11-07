

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			String id = req.getParameter("id");
			String passw = req.getParameter("password");
			
			
			if(id.length()==0 || passw.length()==0)
			{
				res.sendRedirect("/Login/invalid.html");
			}
			else
			{
				req.getServletContext().getRequestDispatcher("/GetResult").forward(req, res);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
