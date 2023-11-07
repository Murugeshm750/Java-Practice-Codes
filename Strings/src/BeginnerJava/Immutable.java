package BeginnerJava;

public class Immutable {
	public static void main(String[] args) {
		//--------- == Operator   --------------
		System.out.println("   == Operator       ");
		System.out.println("");
		String s1="kodnest";
		String s2="kodnest";
		if (s1==s2)
		{
			System.out.println("Reference are equal");
		}
		else
		{
			System.out.println("Reference are not equal");
		}
		System.out.println("-----------------------");
		String s3="kodnest";
		String s4=new String("kodnest");
		if (s3==s4)
		{
			System.out.println("Reference are equal");
		}
		else
		{
			System.out.println("Reference are not equal");
		}
		System.out.println("-----------------------");
		String s5=new String("kodnest");
		String s6=new String("kodnest");
		if (s5==s6)
		{
			System.out.println("Reference are equal");
		}
		else
		{
			System.out.println("Reference are not equal");
		}
		System.out.println("-----------------------");
		String s7="KODNEST";
		String s8="kodnest";
		if (s7==s8)
		{
			System.out.println("Reference are equal");
		}
		else
		{
			System.out.println("Reference are not equal");
		}
		//----------- equals() Method ----------
		System.out.println("-----------------------");
		System.out.println("");
		System.out.println("   equals() Method       ");
		System.out.println("");
		String s9="kodnest";
		String s10="kodnest";
		if (s9.equals(s10))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
		System.out.println("-----------------------");
		String s11="KODNEST";
		String s12="kodnest";
		if (s11.equals(s12))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
		System.out.println("-----------------------");
		String s13="kodnest";
		String s14=new String("kodnest");
		if (s13.equals(s14))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
		System.out.println("-----------------------");
		String s15="kodnest";
		String s16=new String("KODNEST");
		if (s15.equals(s16))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
		//----------  equalsIgnorecase() Method ----------
		System.out.println("-----------------------");
		System.out.println("");
		System.out.println("   equalsIgnorecase() Method       ");
		System.out.println("");
		String a1="kodnest";
		String a2="kodnest";
		if (a1.equalsIgnoreCase(a2))
		{
			System.out.println("values are equal After Ignoring the Case");
		}
		else
		{
			System.out.println("values are not equal After Ignoring the Case");
		}
		System.out.println("-----------------------");
		String a3="kodnest";
		String a4="KODNEST";
		if (a3.equalsIgnoreCase(a4))
		{
			System.out.println("values are equal After Ignoring the Case");
		}
		else
		{
			System.out.println("values are not equal After Ignoring the Case");
		}
		System.out.println("-----------------------");
		String a5="kodnest";
		String a6=new String("KODNEST");
		if (a5.equalsIgnoreCase(a6))
		{
			System.out.println("values are equal After Ignoring the Case");
		}
		else
		{
			System.out.println("values are not equal After Ignoring the Case");
		}
		//-------------   compareTo() Method  ----------
		System.out.println("-----------------------");
		System.out.println("");
		System.out.println("   compareTo() Method       ");
		System.out.println("");
		String q1="KODNEST";
		String q2="kodnest";
		if (q1.compareTo(q2)>0)
		{
			System.out.println("q1 is Greater");
		}
		else if (q1.compareTo(q2)<0)
		{
			System.out.println("q1 is Smaller");
		}
		else {
			System.out.println("Both are Equal");
		}
		System.out.println("-----------------------");
		String q3="kodnest";
		String q4="kod";
		if (q3.compareTo(q4)>0)
		{
			System.out.println("q3 is Greater");
		}
		else if (q3.compareTo(q4)<0)
		{
			System.out.println("q3 is Smaller");
		}
		else {
			System.out.println("Both are Equal");
		}
	}

}

























