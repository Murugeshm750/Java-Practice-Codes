package Interview;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a String");
		String s=scan.next();
		
		StringBuilder  rev= new StringBuilder(s);
		StringBuffer reversed = new StringBuffer();
		
		for (int i=rev.length()-1;i>=0;i--)
		{
			reversed.append(rev.charAt(i));
		}
		System.out.println(reversed);
		
  }
}


