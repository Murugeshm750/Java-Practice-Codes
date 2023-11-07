package Interview;
import java.util.*;
public class Reverse_Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an Number");
		int n=scan.nextInt();
		
		int reverse=0;
		int rem;
		
		while(n!=0)//123
		{
			rem=n%10;//3
			reverse=(reverse*10)+rem;//3
			n=n/10;//0
			
		}
		System.out.println(reverse);
		
		
	}


}
