package Programming;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String Value");
		String str =scan.nextLine();
		String str2=" ";
		for (int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			str2=str2+ch;
			
		}
		System.out.println(str2);
		
		if(str.equals(str2)==true)
		{
			System.out.println("String is Palindrome ");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
