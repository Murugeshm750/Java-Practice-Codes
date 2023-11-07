package Programming;

import java.util.Scanner;

public class String_to_Char {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=scan.next();
		
		String temp=str;
		for (int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+" ");
		}
		System.out.println("-------------------------------------------------");
		int i=0;
		while(i<str.length())
		{
			
			System.out.println(str.charAt(i));
			i++;
		}
		
		System.out.println("----------------------------------------");
		
		do
		{
			System.out.println(str.charAt(i));
			i++;
		}while(i<str.length()-1);
	}
}

























