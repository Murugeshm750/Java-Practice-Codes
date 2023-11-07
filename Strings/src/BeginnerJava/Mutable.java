package BeginnerJava;

public class Mutable {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder ();
		sb.append("hai hello how are you i am fine");
		sb.append("gggg");
		System.out.println(sb.capacity());
		
		
		
		StringBuilder sb1=new StringBuilder (24);
		sb1.append("hai hello how are you i am fine");
		sb1.append("ghj");
		sb1.append("hai hello how are you i am fine");
		System.out.println(sb1.capacity());
		
		
		
		StringBuffer sb2=new StringBuffer ();
		sb2.ensureCapacity(20);
		sb2.append("hai hello how are you i am fine");
		sb2.append("hai hello how are you i am fine");
		System.out.println(sb2.capacity());
	}

}
