import java.net.*;
import java.io.*;

class Server{

	public static void main(String arg[]) throws Exception{

		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();

		DataInputStream din =  new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 ="",str2 ="";

		while(!str1.equals("stop")){

			str1 = din.readUTF();
			System.out.println("Client: "+str1);
			System.out.print("Server: ");
			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();

		}
		din.close();
		s.close();
		ss.close();


	}


}