

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Display
 */
public class Display extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			res.sendRedirect("/Web_Project/display.html");
 		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
