package app;

//������ Ÿ�� �� ����ȯ(������,�����)
public class CastEX {
	public static void main(String args[]) {
		
		char d = 'e';
		char f = 'f';
		String string1 = "dddd";
		int c = (int)d;
		double e = (double)f;
		System.out.println(c);
		System.out.println(e);
		System.out.println(e+f);
		
		//int to boolean -> error

		
		//string to boolean -> error

		
		//boolean to int -> error	

		
		//int to byte -> ok
		int a= 1000000003;
		byte b = (byte)a;
		
		//long to byte -> ok
		long ac= 1000000003;
		byte bc = (byte)ac;
		
		//double to byte -> ok
		double bc1 = 10000003;
		byte cc = (byte)bc1;
		
		//char to string -> error
		
		//string to char -> error 
		
		
		
		
		
		
		
		
		
	}

}
