package Programming;

public class GenarateAmstrongNumber {
	public static void main(String[] args) {
		
		int num,d1,d2,d3,temp,result;
		
		for ( num=1;num<=1000;num++)
		{
			temp=num;
		
			d3=temp%10;
			temp=temp/10;
			
			d2=temp%10;
			temp=temp/10;
			
			d1=temp%10;
		    result=(d3*d3*d3)+(d2*d2*d2)+(d1*d1*d1);
			
			
			if (num==result)
			{
				System.out.println(num+" is Amstrong Number");
			}
		}
	}

}
