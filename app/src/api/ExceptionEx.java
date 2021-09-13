package api;

import app.Member;

/* Exception
 Ű���� �Է�, ���� ó��, ��Ʈ�� ó��, DB ó�� �� �ܺο��� �۾��� �ϴ� ��� 
 ����ġ ���� ������ �߻��� �� �����Ƿ� �ڹٿ����� �ݵ�� ����ó���� �ϵ��� �ϰ� �ִ�. 
 
 */

public class ExceptionEx {
	String str = "";
	public void foo(int i) {
		try {
			if (i == 1) {
				throw new Exception();
			}
			str += "1";
		} catch (Exception e) {
			str += "2";
			return;
		} finally {
			str += "3";
		}
		str += "4";
	}
	/*
	 * public static void main(String[] args) throws Exception{ //������ �ʴ� ���ܰ� �߻��� ��
	 * �ִ� ��Ȳ char c = (char)System.in.read();
	 * 
	 * }
	 */

	// runtime exception
	public static void main(String[] args) {
		ExceptionEx e = new ExceptionEx();
		e.foo(0);
		e.foo(1);
		System.out.println(e.str);
//		int[] arr = new int[1];
		// System.out.println(arr[1]);

//		String str = null;
		// System.out.println(str.charAt(0));

		/*
		 * try { String str1 = "A"; Object member = str1; Member m = (Member) member; }
		 * catch (Exception e) { e.printStackTrace(); } }
		 */

		/*
		 * try { //���� �߻� ���� //�����ڵ�1
		 * 
		 * char c = (char)System.in.read(); //�����ڵ�3 //�����ڵ�4
		 * 
		 * }catch(Exception e) { //����ó�� ����
		 * 
		 * }finally { //�ݵ�� �����ؾ��� ��찡 �ִٸ� �ڵ� �ۼ� }
		 * 
		 * }
		 */
	}
}
