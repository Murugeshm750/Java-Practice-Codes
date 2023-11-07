package BeginnerJava;
public class MyApi5 {
	static int x,y,z;
	static
	{
		x=10;
		y=20;
		z=30;
	}
	static void disp1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	int p,q,r;
	{
		x=77;
		y=88;
		z=99;
	}
	void disp2()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[] args) {
		MyApi5.disp1();
		MyApi5 m =new MyApi5();
		m.disp2();
		
	}	
}

















