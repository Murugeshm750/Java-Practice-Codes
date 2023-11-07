package MultiThread;

public class MsWordApp {
	public static void main(String[] args) {
		
		MsWord ms1 = new MsWord();
		MsWord ms2 = new MsWord();
		MsWord ms3 = new MsWord();
		
		ms1.setName("CHECK");
		ms2.setName("TYPE");
		ms3.setName("PRINT");
		ms1.start();
		ms2.start();
		ms3.start();
		
	}

}
