package Programming;
import java.util.*;

public class MissingElement {
	int arr[];
	int diff;
	public MissingElement(int n)
	{
		arr= new int[n];
	}
	
	void check()
	{
		for(int i=0;i<=arr.length;i++)
		{
			diff=arr[0]-0;
			if(diff!=arr[i]-i)
			{
				while(diff<arr[i]-i)
				{
					System.out.println(diff+i);
					diff++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int n=scan.nextInt();
		MissingElement me = new MissingElement(n);
		for(int i=0;i<=n;i++)
		{
			System.out.println("Enter Element is "+i);
			int arr=scan.nextInt();
		}
		me.check();
	}

}








































