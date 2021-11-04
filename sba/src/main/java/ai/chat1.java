package ai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class chat1 {
	private Socket socket;
	private ServerSocket server;
	public chat1(int port) throws IOException{
		server = new ServerSocket(port);
	}
	public void service() throws IOException {
		System.out.println("echoserver is ready");
		
		//입력을 기다리는 것과 비슷한 block 상태, 교착 상태 
		//연결되면 tcp 허용 상태가 되는 것
		//io장치의 인스턴스를 가지고 주고받고를 하게 된다. 
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter out = new PrintWriter(os,true);
		while(true) {
			String msg = br.readLine();
			System.out.println(msg);
			if(msg.equals("end")) {
				break;
			}
			out.println("-->>"+msg);
		}
		
	}
	public void close() throws IOException{
		server.close();
	}
	public static void main(String[] args) {
		try {
			chat1 es = new chat1(9999);
			es.service();
			es.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void chat1() {
		try {
			chat1 es = new chat1(9999);
			es.service();
			es.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}