package pattern;
import java.util.HashMap;

public class Flames {

	    public static void main(String[] args) {
	        // Create an array of characters
	        char[] letters = {'a', 'b', 'c', 'a'};
	        char[] letters1 = {'a','b','c','d'};

	        // Create a HashMap to store the count of each character
	        HashMap<Character, Integer> letterCount = new HashMap<>();

	        // Iterate through the array of characters
	        for (char c : letters) {
	            // If the character is already in the HashMap, increment the count
	            if (letterCount.containsKey(c)) {
	                letterCount.put(c, letterCount.get(c) + 1);
	            }
	            // If the character is not in the HashMap, add it with a count of 1
	            else {
	                letterCount.put(c, 1);
	            }
	        }

	        // Iterate through the HashMap and print out any characters that have a count greater than 1
	        for (char c : letterCount.keySet()) {
	            if (letterCount.get(c) > 1) {
	                System.out.println(c + " appears " + letterCount.get(c) + " times.");
	            }
	        }
	    
	}
}

