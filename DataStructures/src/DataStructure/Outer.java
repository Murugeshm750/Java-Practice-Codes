package DataStructure;

public class Outer {
	class Inner
	{
		int a= 10;
		int b=20;
	}
	int c;
	
	public void display()
	{
		Inner i = new Inner();
		System.out.println(i.a);
		System.out.println(i.b);

	}
	/*public static void main(String[] args) {
		
		Outer o =new Outer();
		o.display();
	}*/

	

}
