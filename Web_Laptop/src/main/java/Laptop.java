

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Laptop
 */
public class Laptop extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		try {
			res.sendRedirect("/Web_Laptop/laptop.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
