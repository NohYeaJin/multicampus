package app;

import java.util.regex.Pattern;

public class PatternEx {
	/*
	 ����)
	 *(02|010) : 02 �Ǵ� 010
	 * -       :  - ����
	 * \\d{3,4}: 3�ڸ� �Ǵ� 4�ڸ� ���� ���� 
	 * \\�ΰ��� Ư������ ����
	 */
	
	/*
	 * \w+ : �� �� �̻��� ���ĺ� �Ǵ� ����
	 * @: @
	 * \. : .
	 * (\.\w+)?: \.\w+�� ���ų� �ѹ��� �� �� ����.
	 * 
	 */
	public static void main(String[] args) {
		String regEx = "(02|010)-\\d{3,4}-\\d{4}";
		String data="010-1234-5678";
		boolean result=Pattern.matches(regEx, data);
		if(result) {
			System.out.println("��ġ�մϴ�.");
		}else {
			System.out.println("��ġ���� �ʽ��ϴ�.");
		}
		
		regEx = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		result=Pattern.matches(regEx, data);
		if(result) {
			System.out.println("��ġ�մϴ�.");
		}else {
			System.out.println("��ġ���� �ʽ��ϴ�.");
		}

	}

}
