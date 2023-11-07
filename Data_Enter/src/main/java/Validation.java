

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Validation extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			String username = req.getParameter("username");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
	
			if(username.length()==0 || email.length()==0 || password.length()==0)
			{
				res.sendRedirect("/Data_Enter/error.html");
			}
			else
			{
				req.getServletContext().getRequestDispatcher("/Register").forward(req, res);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
