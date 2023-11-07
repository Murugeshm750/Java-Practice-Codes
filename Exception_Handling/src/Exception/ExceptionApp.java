package Exception;



public class ExceptionApp {
	public static void main(String[] args)  {
		
		Exception2 e2 =new Exception2();
		
		try
		{
			e2.activity();
		}
		catch(Exception e)
		{
			System.out.println("Exception is Handled In Main Method");
		}
	}

}
