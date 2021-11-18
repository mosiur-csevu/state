import java.net.*;
import java.io.*;

class Client{

	public static void main(String args[]) throws Exception{

		Socket s = new Socket("localhost",6666);
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1="",str2="";
		while(!str1.equals("stop")){
			System.out.print("Client: ");
			str1 = br.readLine();
			dout.writeUTF(str1);
			dout.flush();

			str2 = din.readUTF();
			System.out.println("Server: "+str2);

		}
		dout.close();
		s.close();

	}

}