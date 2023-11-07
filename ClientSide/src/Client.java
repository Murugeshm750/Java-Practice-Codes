import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Client {
	public static void main(String[] args) {
		try {
			Socket cs = new Socket("localhost",6000);
			OutputStream os = cs.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = cs.getInputStream();
			Scanner scan = new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter a Msg");
				String msg=scan.nextLine();
				dos.writeUTF(msg);
				String reply= scan.nextLine();
				System.out.println(reply);
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
