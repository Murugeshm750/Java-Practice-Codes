package pattern;

public class API {
	public void sort(Employee arr[],String property)
	{
		if(property.equals("id"))
		{
			//code for sorting based on id
			sortBasedOnId(arr);
			
		}
		else if(property.equals("name"))
		{
			//code for sorting based on name
			sortBasedOnName(arr);
			
		}
		else
		{
			//sort based on salary
			sortBasedOnSalary(arr);
		}
	}
		public void sortBasedOnId(Employee arr[])
		{
			for(int i=0;i<=arr.length-2;i++)
			{
				for(int j=0;j<=arr.length-2-i;j++)
				{
					if(arr[j].id>arr[j+1].id)
					{
						Employee temp;
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
		}
		
		public void sortBasedOnName(Employee arr[])
		{
			for(int i=0;i<=arr.length-2;i++)
			{
				for(int j=0;j<=arr.length-2-i;j++)
				{
					if(arr[j].name.compareTo(arr[j+1].name)>0)
					{
						Employee temp;
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
		}
		
		public void sortBasedOnSalary(Employee arr[])
		{
			for(int i=0;i<=arr.length-2;i++)
			{
				for(int j=0;j<=arr.length-2-i;j++)
				{
					if(arr[j].salary>arr[j+1].salary)
					{
						Employee temp;
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			
			}

	}

}
