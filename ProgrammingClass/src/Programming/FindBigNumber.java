package Programming;

public class FindBigNumber {
	public static void main(String[] args) {
		
		int arr[]= {4,3,9,6,2};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int ele = -1;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					 ele=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+" ---> "+""+ele);
		}
		System.out.println("------------------");
		int arr1[]= {3,6,1,5,2};
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			int ele = -1;
			for(int j=i+1;j<=arr1.length-1;j++)
			{
				if(arr1[i]<arr1[j])
				{
					 ele=arr1[j];
					break;
				}
			}
			System.out.println(arr1[i]+" ---> "+""+ele);
		}
	}

}
