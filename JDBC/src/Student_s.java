import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.jdbc.JdbcPreparedStatement;
public class Student_s {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String path = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";//1521
		String un = "system";
		String pw = "system";
		Connection con = null;
		Statement stmt = null;
//		PreparedStatement pst = null;
		ResultSet rs;
		String display="select * from car";
		
		try {
			Class.forName(path);
			System.out.println("Driver Loaded Successfully....");
			con=DriverManager.getConnection(url,un,pw);
			System.out.println("Connection Established.....");
			stmt=con.createStatement();
			rs=stmt.executeQuery(display);
			
			while(rs.next())
			{
				String brand=rs.getString(1);
				int cost = rs.getInt(2);
				System.out.println(brand+" "+cost);
			}
			System.out.println("Query has been Executed");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
