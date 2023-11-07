package Programming;

public class Char_To_String {
public static void main(String[] args) {
	char[] ch= {'k','o','d','n','e','s','t'};
	
	String str="";
	for(int i=0;i<=ch.length-1;i++)
	{
		str=str+ch[i];
	}
	System.out.println(str);
	System.out.println(ch);

	
}
}
