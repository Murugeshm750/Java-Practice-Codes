package MultiThread;

public class ProgramApp {
	public static void main(String[] args) {
		
		Program p1 = new Program();
		Program p2 = new Program();
		Program p3 = new Program();
		
		p1.setName("BANK");
		p2.setName("ADD");
		p3.setName("PRINT");
		
		p1.start();
		p2.start();
		p3.start();
	}

}
