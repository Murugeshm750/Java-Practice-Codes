package BeginnerJava;
import java.util.*;

public class Smart_city 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String c1="Chennai";
		String c2="Mumbai";
		String c3="Bangalore";
		
		System.out.println("Searchig for ATM ");
		System.out.println("---------------------");
		System.out.println("City Names");
		System.out.println("1. "+c1);
		System.out.println("2. "+c2);
		System.out.println("3. "+c3);
		System.out.println("---------------------");
		System.out.println("Choose One City");
		String choose=scan.next();
		
		if (choose.equals(c1))
		{
			System.out.println("There are 2962 ATM's in Chennai...");
		}
	}
}

































