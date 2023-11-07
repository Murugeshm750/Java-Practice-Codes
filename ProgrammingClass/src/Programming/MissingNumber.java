package Programming;

public class MissingNumber {
	public static void main(String[] args) 
	{
		int[] numbers = {1, 2, 3, 5, 6, 7, 8};

		for (int i = 0; i < numbers.length; i++) 
		{
		  if (numbers[i] != i + 1) 
		  {
		    System.out.println("Missing number: " +numbers[i]);
		  }
		}

	}

}
