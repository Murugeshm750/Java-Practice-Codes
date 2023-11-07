package BeginnerJava;
import java.util.Scanner;
public class Travel 
{
	public static void main(String[] args) 
	{
		        Scanner scan = new Scanner(System.in);
		        //Store the States
		        String s1= "Tamilnadu";
		        String s2= "Kerala";
		        String s3= "Karnataka";
		        String s4= "Manipur";
		        String s5= "Andhra";
		        //tamilnadu
		        String d1= "Madurai";
		        String d2= "Rameshwaram";
		        String d3= "kodaikanal";
		        String d4= "vaalpaarai";
		        String d5= "ooty";
		        //kerala
		        String k1= "kochi";
		        String k2= "Malampuzha";
		        String k3= "Allappi";
		        String k4= "Walayar";
		        String k5= "Thirvandram";
		        //karnataka
		        String ka1= "mysore";
		        String ka2= "coorg";
		        String ka3= "hampi";
		        String ka4= "gokarna";
		        String ka5= "bangelore";
		        //andhra
		        String a1= "araku";
		        String a2= "valley";
		        String a3= "tripati";
		        String a4= "amaravathy";
		        String a5= "vijaya vada";
		        //manipur
		        String m1= "loktak";
		        String m2= "kangla fort";
		        String m3= "ema keithel market";
		        String m4= "imphal valley";
		        String m5= "singda dam";
		        //storing the data
				String[]arr=new String[5];
				arr[0]=s1;
				arr[1]=s2;
				arr[2]=s3;
				arr[3]=s4;
				arr[4]=s5;
				String[]arr1=new String[5];
				arr1[0]=d1;
				arr1[1]=d2;
				arr1[2]=d3;
				arr1[3]=d4;
				arr1[4]=d5;
				String[]arr2=new String[5];
				arr2[0]=k1;
				arr2[1]=k2;
				arr2[2]=k3;
				arr2[3]=k4;
				arr2[4]=k5;
				String[]arr3=new String[5];
				arr3[0]=ka1;
				arr3[1]=ka2;
				arr3[2]=ka3;
				arr3[3]=ka4;
				arr3[4]=ka5;
				String[]arr4=new String[5];
				arr4[0]=a1;
				arr4[1]=a2;
				arr4[2]=a3;
				arr4[3]=a4;
				arr4[4]=a5;
				String[]arr5=new String[5];
				arr5[0]=m1;
				arr5[1]=m2;
				arr5[2]=m3;
				arr5[3]=m4;
				arr5[4]=m5;
				//Display the States
				for (int i=0;i<=arr.length-1;i++)
				{
					System.out.println((i+1)+". "+arr[i]);
				}
				System.out.println("__________________________________________");
				System.out.println("Which State You Want To Visit !Please Select One!");
				String choose=scan.next();
				for(int i=0;i<=arr.length-1;i++)
				{

					if(choose.equals("Kerala"))
					{
						System.out.println("Kerala is God's own country");
						System.out.println("__________________________________________");
						System.out.println("These are Tourist Places in Kerala");
						for (int i6=0;i6<=arr2.length-1;i6++)
						{
						System.out.println(arr2[i6]);
						}
						/*System.out.println("1."+k1);
						System.out.println("2."+k2);
						System.out.println("3."+k3);
						System.out.println("4."+k4);
						System.out.println("5."+k5);*/
						System.out.println("__________________________________________");
						System.out.println("Please choose one place");
						String place=scan.next();
						for (int i1=0;i1<=arr2.length-1;i1++)
						{
							if (place.equals(arr2[i1]))
							{
								System.out.println("Please visit this place !Have a nice day!");
								System.exit(0);
							}
						}
						System.out.println("! Please choose the correct one !");
						System.exit(0);
					}
					if(choose.equals("Tamilnadu"))
					{
						System.out.println("Tamilnadu is God's own country");
						System.out.println("__________________________________________");
						System.out.println("These are Tourist Places in Tamilnadu");
						System.out.println("1."+d1);
						System.out.println("2."+d2);
						System.out.println("3."+d3);
						System.out.println("4."+d4);
						System.out.println("5."+d5);
						System.out.println("__________________________________________");
						System.out.println("Please choose one place");
						String place=scan.next();
						for (int i2=0;i2<=arr1.length-1;i2++)
						{
							if (place.equals(arr1[i2]))
							{
								System.out.println("Please visit this place !Have a nice day!");
								System.exit(0);
							}
						}
						System.out.println("! Please choose the correct one !");
						System.exit(0);
					}
					if(choose.equals("Karnataka"))
					{
						System.out.println("Karnataka is God's own country");
						System.out.println("__________________________________________");
						System.out.println("These are Tourist Places in Karnataka");
						System.out.println("1."+ka1);
						System.out.println("2."+ka2);
						System.out.println("3."+ka3);
						System.out.println("4."+ka4);
						System.out.println("5."+ka5);
						System.out.println("__________________________________________");
						System.out.println("Please choose one place");
						String place=scan.next();
						for (int i3=0;i3<=arr3.length-1;i3++)
						{
							if (place.equals(arr3[i3]))
							{
								System.out.println("Please visit this place !Have a nice day!");
								System.exit(0);
							}
						}
						System.out.println("! Please choose the correct one !");
						System.exit(0);
					}
					if(choose.equals("Manipur"))
					{
						System.out.println("Manipur is God's own country");
						System.out.println("__________________________________________");
						System.out.println("These are Tourist Places in Manipur");
						System.out.println("1."+m1);
						System.out.println("2."+m2);
						System.out.println("3."+m3);
						System.out.println("4."+m4);
						System.out.println("5."+m5);
						System.out.println("__________________________________________");
						System.out.println("Please choose one place");
						String place=scan.next();
						for (int i4=0;i4<=arr5.length-1;i4++)
						{
							if (place.equals(arr5[i4]))
							{
								System.out.println("Please visit this place !Have a nice day!");
								System.exit(0);
							}
						}
						System.out.println("! Please choose the correct one !");
						System.exit(0);
					}
					if(choose.equals("Andhra"))
					{
						System.out.println("Andhra Pradesh is God's own country");
						System.out.println("__________________________________________");
						System.out.println("These are Tourist Places in Andhra Pradesh");
						System.out.println("1."+a1);
						System.out.println("2."+a2);
						System.out.println("3."+a3);
						System.out.println("4."+a4);
						System.out.println("5."+a5);
						System.out.println("__________________________________________");
						System.out.println("Please choose one place");
						String place=scan.next();
						for (int i5=0;i5<=arr4.length-1;i5++)
						{
							if (place.equals(arr4[i5]))
							{
								System.out.println("Please visit this place !Have a nice day!");
								System.exit(0);
							}
						}
						System.out.println("! Please choose the correct one !");
						System.exit(0);
					}
				}
				System.out.println("Invalid input");
			} 
  }









































