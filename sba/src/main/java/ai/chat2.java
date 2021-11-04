package ai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class chat2 {

	private Socket socket;

	public chat2(String host, int port) throws Exception {
		socket = new Socket(host, port);
	}

	public void echo() throws IOException {
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter out = new PrintWriter(os, true);
		BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String msg = con.readLine();
			out.println(msg);
			if (msg.equals("bye")) {
				break;
			}
			// 원격지에서 내 pc로 출력
			System.out.println(br.readLine());
		}
	}

	public void close() throws IOException {
		socket.close();
	}

	public static void main(String[] args) {
		try {
			chat2 ec;
			System.out.println("메세지를 입력하세요: ");
			if (args.length > 0) {
				ec = new chat2(args[0], 9999);
			} else {
				ec = new chat2("localhost", 9999);
			}
			ec.echo();
			ec.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void chat2(String[] args) {
		try {
			chat2 ec;
			System.out.println("메세지를 입력하세요: ");
			if (args.length > 0) {
				ec = new chat2(args[0], 9999);
			} else {
				ec = new chat2("localhost", 9999);
			}
			ec.echo();
			ec.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}