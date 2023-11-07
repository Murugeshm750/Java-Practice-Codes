package Interview;

public class Sequence {

	public static int absoluteDifference(int[] sequence) {
	    int sum = 0;
	    for (int i = 1; i < sequence.length; i++) {
	        sum += Math.abs(sequence[i] - sequence[i-1]);
	    }
	    return sum;
	}
public static void main(String[] args) {
	Sequence s = new  Sequence();
	s.absoluteDifference(6,11,7,4,2,1);
}
private void absoluteDifference(int i, int j, int k, int l, int m, int n) {
	// TODO Auto-generated method stub
	
}
}
