package Programming;
import java.util.*;
public class FindBiginArray {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Enter the Length of Array");
		 int n=scan.nextInt();
	        int[] numbers = new int[n];
	        
	        System.out.println("Enter element in array");
	        for(int i=0;i<=numbers.length-1;i++)
	        {
	        	
	        	numbers[i]=scan.nextInt();
	        }
	        
	        int largest = findLargest(numbers);
	        System.out.println(largest); 
	    }

	    public static int findLargest(int[] arr) 
	    {
	        int maxValue = arr[0];  
	        for (int i = 1; i < arr.length; i++)
	        {  
	            if (arr[i] > maxValue)
	            { 
	                maxValue = arr[i];
	            }
	        }
	        return maxValue; 
	    }
	    
	    void smallElement()
	    {
	    	
	    }
	}



