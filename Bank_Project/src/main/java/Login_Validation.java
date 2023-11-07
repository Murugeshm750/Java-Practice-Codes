

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login_Validation
 */
public class Login_Validation extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			String acc = req.getParameter("accno");
			String passw = req.getParameter("password");
			
			if(acc.length()==0 && passw.length()==0)
			{
				res.sendRedirect("/Bank_Project/invalid.html");
			}
			else
			{
				req.getServletContext().getRequestDispatcher("/Login_Bank").forward(req, res);

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
