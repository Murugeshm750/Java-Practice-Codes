import java.sql.*;
import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		Connection con = null;
		Statement smt;
		PreparedStatement pst;
		ResultSet rs;
		
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String un="system";
		String pw="system";
		

		String insert="insert into Laptop values(?,?,?,?,?,?)";
		String delete="delete from Laptop where id=?";
		String display="select * from Laptop";
//		String update="update Laptop set Name=?,Ram=?,Color=?,prosessor=?,Price=? where id=?";
		String updateName="update Laptop set Name=? where id=?";
		String updateRam="update Laptop set Ram=? where id=?";
		String updateColor="update Laptop set Color=? where id=?";
		String updatePros="update Laptop set processor=? where id=?";
		String updatePrice="update Laptop set Price=? where id=?";
		
		
		
		try {
			Class.forName(path);
			System.out.println("Driver Loaded Successfully...!");
			con=DriverManager.getConnection(url, un, pw);
			System.out.println("Connection Established successfully..!");
			} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
		while(true)
		{
		
		System.out.println("press 1----> INSERT");
		System.out.println("Press 2----> DELETE");
		System.out.println("Press 3----> DISPLAY");
		System.out.println("Press 4----> UPDATE");
		System.out.println("Press Any ---> EXIT");
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1:
			try
			{
			System.out.println("Enter id of Laptop");
			int id=scan.nextInt();
			System.out.println("Enter Name of Laptop");
			String name=scan.next();
			System.out.println("Enter Ram of Laptop");
			int ram=scan.nextInt();
			System.out.println("Enter Color of Laptop");
			String color=scan.next();
			System.out.println("Enter Processor of Laptop");
			String pros=scan.next();
			System.out.println("Enter Price of Laptop");
			int price=scan.nextInt();
			pst=con.prepareStatement(insert);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3,ram);
			pst.setString(4, color);
			pst.setString(5, pros);
			pst.setInt(6, price);
			
			pst.executeUpdate();
			
			System.out.println("Data Inserted Successfully...!");
			} 
			catch (SQLException e) 
			{
			e.printStackTrace();
			}
		break;
		case 2:
			System.out.println("Enter Id of Laptop");
			int id=scan.nextInt();
			try {
				pst=con.prepareStatement(delete);
				pst.setInt(1, id);
				pst.executeUpdate();
				System.out.println("Data Deleted Successfully...!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		break;
		case 3:
			try {
				smt=con.createStatement();
				rs=smt.executeQuery(display);
				while(rs.next())
				{
					 id=rs.getInt(1);
					 String name=rs.getString(2);
					 int ram=rs.getInt(3);
					 String color=rs.getString(4);
					 String pros=rs.getString(5);
					 int price=rs.getInt(6);
					 
					 System.err.println("-->  "+id+" "+name+" "+ram+" "+color+" "+pros+" "+price);
				}
				} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			break;
		case 4:
			System.out.println("Press 1 ---> Name");
			System.out.println("Press 2 ---> Ram");
			System.out.println("Press 3 ---> Color");
			System.out.println("Press 4 ---> Processor");
			System.out.println("Press 5 ---> Price");
			System.out.println("What would you Like to change");
			int change=scan.nextInt();
			
			switch(change)
			{
			case 1:
				try {
					System.out.println("Enter Id of Laptop");
					id=scan.nextInt();
					System.out.println("Enter New Name of Laptop");
					String name=scan.next();
					pst=con.prepareStatement(updateName);
					pst.setString(1, name);
					pst.setInt(2, id);
					pst.executeUpdate();
					System.out.println("Data Updated Successfully..!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			break;
			case 2:
				try {
					System.out.println("Enter Id of Laptop");
					id=scan.nextInt();
					System.out.println("Enter New Ram of Laptop");
					String ram=scan.next();
					pst=con.prepareStatement(updateRam);
					pst.setString(1, ram);
					pst.setInt(2, id);
					pst.executeUpdate();
					System.out.println("Data Updated Successfully..!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			break;
			case 3:
				try {
					System.out.println("Enter Id of Laptop");
					id=scan.nextInt();
					System.out.println("Enter New Color of Laptop");
					String color=scan.next();
					pst=con.prepareStatement(updateColor);
					pst.setString(1, color);
					pst.setInt(2, id);
					pst.executeUpdate();
					System.out.println("Data Updated Successfully..!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			break;
			case 4:
				try {
					System.out.println("Enter Id of Laptop");
					id=scan.nextInt();
					System.out.println("Enter New Processor of Laptop");
					String pros=scan.next();
					pst=con.prepareStatement(updatePros);
					pst.setString(1, pros);
					pst.setInt(2, id);
					pst.executeUpdate();
					System.out.println("Data Updated Successfully..!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			break;
			case 5:
				try {
					System.out.println("Enter Id of Laptop");
					id=scan.nextInt();
					System.out.println("Enter New Price of Laptop");
					String price=scan.next();
					pst=con.prepareStatement(updatePrice);
					pst.setString(1, price);
					pst.setInt(2, id);
					pst.executeUpdate();
					System.out.println("Data Updated Successfully..!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			break;
			}
			default: 
				System.out.println("Program has Completed...!");
				System.exit(0);
			
		}
		}
	}	
}
