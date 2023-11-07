import java.sql.*;
import java.util.Scanner;

public class Bank {
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
		
//		String create="create table Bank(id int,Name varchar2(20),Email varchar2(20),Balance int)";
//		String insert="insert into Bank values(?,?,?,?)";
		String update="update Bank set Balance=Balance+5000 where id=?";
		String update1="update Bank set Balance=Balance-5000 where id=?";
		
		try {
			Class.forName(path);
			System.out.println("Driver Loaded Successfully...");
			con=DriverManager.getConnection(url,un,pw);
			System.out.println("Connection Established Successfully....");
			
			System.out.println("Enter Id of Customer");
			int id=scan.nextInt();
			System.out.println("Enter Id1 of Customer");
			int id1=scan.nextInt();
			/*
			System.out.println("Enter Name of Customer");
			String name=scan.next();
			System.out.println("Enter Email of Customer");
			String email=scan.next();
			
			System.out.println("Enter Balance of Customer");
			int balance=scan.nextInt();
			*/
			pst=con.prepareStatement(update);
			pst.setInt(1,id);
			pst.executeUpdate();
			
			pst=con.prepareStatement(update1);
			pst.setInt(1,id1);
			pst.executeUpdate();
			

//			smt=con.createStatement();
//			smt.executeUpdate(create);
			System.out.println("Table Data Updated Successfully...");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
