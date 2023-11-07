package Programming;

public class Array_Length {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};

	    // Find the number of elements in the array
	    int count = 0;
	    for (int i = 0; i < array.length; i++) {
	      count++;
	    }

	    System.out.println("The number of elements in the array is: " + count);
	}

}
