package Programming;

public class Swaping {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int temp;
	    //Using variable
		//Swapping the values
		temp=b;
		b=a;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------------");
		
		//Without using variable
		//Swapping the values
		
		a=a+b;//100+200 = 300 = a
		b=a-b;//300-200 = 100 = b
		a=a-b;//300-100 = 200 = a 
		a=a-b;//200-100 = 100 = a
		b=a+b;//100+100 = 200 = b
		System.out.println(a);
		System.out.println(b);

		
	}
}
























