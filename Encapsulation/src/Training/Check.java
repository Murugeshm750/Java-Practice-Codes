package Training;

public class Check {
public static void main(String[] args) {
	String []arr= {"c++","c","java","py"};
	for (int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
		if (arr[i].equals("java"))
			continue;
		System.out.println("fghjm,.");
		break;
	}
}
}
