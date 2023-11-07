package BeginnerJava;
import java.util.StringTokenizer;

public class String_token {
	public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("java sql apti","a");
	while (st.hasMoreTokens()==true)
	{
		System.out.println(st.nextToken());
	}
	}
}
