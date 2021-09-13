package api;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "김자바 이자바 박자바";
		StringTokenizer st = new StringTokenizer(text, " ");
		System.out.println(st.countTokens());
		// 사용할 토큰이 있다면 true 반환, 없으면 false 반환
		// 하나씩 넘기면서 사용하고, 그 다음꺼 사용...
//		while(st.hasMoreElements()) {

//			Object el = st.nextElement();

//			System.out.println(el.toString());
		
		//int count = st.countTokens();
		for (int i = 0; i < st.countTokens(); i++) {
			String el = st.nextToken();

			System.out.println(el);
			System.out.println("ddd");
		}
		
		for (int i = 0; i < st.countTokens(); i++) {
			String el = st.nextToken();

			System.out.println(el);
			System.out.println("kkk");
		}
	}

}
