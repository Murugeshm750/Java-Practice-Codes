package BeginnerJava;
import java.util.Scanner;
public class DemoApp {
public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Enter a String");
		String s=scan.next();
		System.out.println("Enter a char");
		char c1=scan.next().charAt(0);
		Demo d=new Demo();
		System.out.println(d.Find(s, c1));
	}
	
}
}
