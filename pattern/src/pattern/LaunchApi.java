package pattern;
import java.util.*;
public class LaunchApi {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of objects to be created");
		Employee array[]=new Employee[scan.nextInt()];
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.println("Enter id");
			int id=scan.nextInt();
			System.out.println("Enter name");
			String name=scan.next();
			System.out.println("Enter Salary");
			int salary=scan.nextInt();
			array[i]=new Employee(id,name,salary);
		}
		System.out.println("Objects in Array Before Sorting");
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i].id+" "+array[i].name+" "+array[i].salary+" || ");
		
		}
		System.out.println();
		System.out.println("Enter the Property on which sorting should be done i,e id or name or salary ?");
		String property=scan.next();
		API api=new API();
		api.sort(array, property);
		System.out.println("Objects in Array After Sorting");
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i].id+" "+array[i].name+" "+array[i].salary+" || ");
		
		}
	}


}
