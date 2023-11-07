
import java.sql.DriverManager;
import java.sql.SQLException;


public class FirstJdbc {
	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...!!!");
			try {
				DriverManager.getConnection("jdbc:mysql://localhost","root","");
				System.out.println("Connection established Successfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		String url1="jdbc:oracle:thin:@localhost:1521:xe";
		String un1="system";
		String pw1="system";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Done");
			try {
				DriverManager.getConnection(url1,un1,pw1);
				System.out.println("Connection Successfully....!!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pw="system";
		try
		{
		Class.forName(path);
		System.out.println("Driver is loaded");
		DriverManager.getConnection(url, un, pw);
		System.out.println("Connection done");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
}
