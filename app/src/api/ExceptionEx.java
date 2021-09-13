package api;

import app.Member;

/* Exception
 키보드 입력, 파일 처리, 네트웍 처리, DB 처리 등 외부와의 작업을 하는 경우 
 예의치 못한 에러가 발생할 수 있으므로 자바에서는 반드시 예외처리를 하도록 하고 있다. 
 
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
	 * public static void main(String[] args) throws Exception{ //뜻하지 않는 예외가 발생할 수
	 * 있는 상황 char c = (char)System.in.read();
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
		 * try { //예외 발생 지역 //실행코드1
		 * 
		 * char c = (char)System.in.read(); //실행코드3 //실행코드4
		 * 
		 * }catch(Exception e) { //예외처리 지역
		 * 
		 * }finally { //반드시 실행해야할 경우가 있다면 코드 작성 }
		 * 
		 * }
		 */
	}
}
