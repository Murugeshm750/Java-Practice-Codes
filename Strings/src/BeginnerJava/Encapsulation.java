package BeginnerJava;

public class Encapsulation {
	private int PageNo;
	public void setData (int x)
	{
		if (x>0)
		{
			PageNo=x;
		}
		else
		{
			System.out.println("Inavlid Input");
		}
	}
	public int getData ()
	{
		return PageNo;
	}

}
