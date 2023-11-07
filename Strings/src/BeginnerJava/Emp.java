package BeginnerJava;
import java.util.*;
public class Emp {
	Scanner scan = new Scanner(System.in);
	private String Empname;
	private int id,salary;
	public void setData(String x,int y,int z)
	{
		Empname=x;
		id=y;
		salary=z;
	}
	public String getData()
	{
		return Empname;
	}
	public int getData1()
	{
		return id;
	}
	public int getData2()
	{
		return salary;
	}
}



















