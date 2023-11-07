package Training;

public class Alpha1 {
public static void main(String[] args) {
	int alpha=1;
	int alpha1=64;
	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=5;j++)
		{
			System.out.print((char)(alpha1+j)+"$"+j+" ");
			
			
		}
		alpha++;
		alpha1++;
		System.out.println();
	}

}
}
