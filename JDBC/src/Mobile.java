import java.sql.*;
import java.util.Scanner;
public class Mobile {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String un="system";
		String pw="system";
		
		Connection con;
		Statement smt;
		PreparedStatement pst;
		ResultSet rs;
		 
		String create="create table Laptop(id int ,Name varchar2(20),Ram int,color varchar2(10),Processor varchar2(10),Price int)";
//		String insert="insert into mobile values(?,?,?,?)";
//		String display="select * from Mobile";
		
		try {
			Class.forName(path);
			System.out.println("Driver Loaded Successfully....");
			con=DriverManager.getConnection(url,un,pw);
			System.out.println("Connection Established....");
			
			
/*
			System.out.println("Enter Mobile Name");
			String name=scan.next();
			System.out.println("Enter Mobile Cost");
			int cost=scan.nextInt();
			System.out.println("Enter Mobile Ram");
			int ram=scan.nextInt();
			System.out.println("Enter Mobile Rom");
			int rom=scan.nextInt();
			
			pst=con.prepareStatement(insert);
			pst.setString(1, name);
			pst.setInt(2, cost);
			pst.setInt(3, ram);
			pst.setInt(4, rom);
			pst.executeUpdate();

			smt=con.createStatement();
			rs=smt.executeQuery(display);
			
			while(rs.next())
			{
				String name=rs.getString(1);
				int cost=rs.getInt(2);
				int ram=rs.getInt(3);
				int rom=rs.getInt(4);
				System.out.println(name+" "+cost+" "+ram+" "+rom);

			}
			System.out.println("Display successfull...");
			
	*/		
			
			System.out.println("Table Data inserted Successfully...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
