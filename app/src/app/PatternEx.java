package app;

import java.util.regex.Pattern;

public class PatternEx {
	/*
	 보기)
	 *(02|010) : 02 또는 010
	 * -       :  - 포함
	 * \\d{3,4}: 3자리 또는 4자리 숫자 포함 
	 * \\두개는 특수문자 적용
	 */
	
	/*
	 * \w+ : 한 개 이상의 알파벳 또는 숫자
	 * @: @
	 * \. : .
	 * (\.\w+)?: \.\w+이 없거나 한번더 올 수 있음.
	 * 
	 */
	public static void main(String[] args) {
		String regEx = "(02|010)-\\d{3,4}-\\d{4}";
		String data="010-1234-5678";
		boolean result=Pattern.matches(regEx, data);
		if(result) {
			System.out.println("일치합니다.");
		}else {
			System.out.println("일치하지 않습니다.");
		}
		
		regEx = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		result=Pattern.matches(regEx, data);
		if(result) {
			System.out.println("일치합니다.");
		}else {
			System.out.println("일치하지 않습니다.");
		}

	}

}
