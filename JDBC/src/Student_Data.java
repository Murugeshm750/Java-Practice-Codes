import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.Statement;

public class Student_Data {
public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	
	String path="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String un = "system";
	String pw="system";
	String create="create table Data(name varchar2(20),age int,location varchar2(20)";
	String insert="insert into Data values(?,?,?)";
	String name,location;
	int age;
	Connection con;
	//PreparedStatement pst;
	Statement smt= null;
	
	try {
		// Step 1 : Loading the Driver
		Class.forName(path);
		System.out.println("Driver Loaded Successfully...!!!!");
		
		// Step 2 : Establishing the Connection
		con=DriverManager.getConnection(url, un, pw);
		System.out.println("Connection Established Successfully..!!!");
		
		// Step 3 : Creating the Statement
		smt=con.createStatement();
		// Step 4 : Executing
		smt.executeUpdate(create);
		System.out.println("table created Successfully..!!");
		
		} 
	catch (Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
