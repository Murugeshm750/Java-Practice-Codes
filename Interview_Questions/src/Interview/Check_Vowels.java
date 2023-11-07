package Interview;
import java.util.*;

public class Check_Vowels {
	public static void main(String[] args) {
			Scanner scan= new Scanner (System.in);
		    System.out.println("Enter String");
		    String s = scan.next();

		    if (s.matches(".*[aeiouAEIOU].*"))
		    {
		      System.out.println("The string contains a vowel.");
		    }
		    else
		    {
		    	System.out.println("not");
		    }
		    
		    
		    
		    
		  /*  
		    String s = "Hello, World!";
		    List vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		    for (char c : s.toCharArray()) {
		      if (vowels.contains(c)) {
		        System.out.println("The string contains a vowel.");
		        break;
		      }
		    }*/
		
	}

}
