package api;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "���ڹ� ���ڹ� ���ڹ�";
		StringTokenizer st = new StringTokenizer(text, " ");
		System.out.println(st.countTokens());
		// ����� ��ū�� �ִٸ� true ��ȯ, ������ false ��ȯ
		// �ϳ��� �ѱ�鼭 ����ϰ�, �� ������ ���...
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
