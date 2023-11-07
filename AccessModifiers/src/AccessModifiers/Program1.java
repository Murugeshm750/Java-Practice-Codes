package AccessModifiers;

public class Program1 {
	public int a;
	private int b;
	int c;
	private int d;
	
	void disp1 ()
	{
		System.out.println(a);
		System.out.println(getB());
		System.out.println(c);
		System.out.println(d);
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
