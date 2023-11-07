package Exception;

public class CalculatorApp {
public static void main(String[] args)  {
	Calculator c= new Calculator();
	
	c.add();
	

	try
	{
		c.sub();
	}
	catch(Exception e)
	{
		System.out.println("Exception is Handled is Main Method for SUB");
	}
	
	try
	{
		c.div();
	}
	catch(Exception e)
	{
		System.out.println("Exception is Handled in Main Method for DIV");
	}
	try
	{
		c.mul();
	}
	catch(Exception e)
	{
		System.out.println("Exception is Handled in Main Method for MUL");
	}
	
}
}
