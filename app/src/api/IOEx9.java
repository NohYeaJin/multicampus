package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOEx9 {
	/*
	 * public static void main(String[] args) throws IOException{ File file = new
	 * File("C:/work/IOtest.txt"); FileWriter fwriter = new FileWriter(file);
	 * BufferedWriter bw = new BufferedWriter(fwriter); //buffer�� �� �����Ӱ� ���� ���� ��
	 * //printwriter�ȿ� autoflush�� ���� PrintWriter pw = new PrintWriter(bw,true);
	 * InputStream is = System.in; InputStreamReader isr = new
	 * InputStreamReader(is); BufferedReader br = new BufferedReader(isr);
	 * System.out.print("�Է�: "); String str = ""; while(!str.equals("end")) { str =
	 * br.readLine(); pw.println(str);
	 * 
	 * } br.close(); pw.close();
	 */
	// ��������:���Ͽ� ��ϵ� ���ڵ����͸� ȭ�鿡 ����Ͻÿ�.
	//Ȱ�빮��: ��ũ�� ����� �����͸� ���Ϸ� ����ϴ� ���α׷� �ۼ�
	public static void main(String[] args) throws IOException {
		File file = new File("C:/work/IOtest.txt");

		FileReader fr = new FileReader(file);

		String c = " ";
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while(!str.equals("end")) {
			str = br.readLine();
			System.out.println(str);
		}
		br.close();
	}

}
