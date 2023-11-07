package BeginnerJava;

public class Strings {
	public static void main(String[] args) {
		String s1="kodnst";
		String s2="Tech";
		String s3=new String("kodnest");
		String s4="kodnst1";
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		System.out.println(s1+s3);
		System.out.println(s1+s2);
		if (s1==s2)
		{
			System.out.println("nice");
		}
		else if (s1==s4)
		{
			System.out.println("good");
		}
		else
		{
			System.out.println("try again");
		}
	}
}
