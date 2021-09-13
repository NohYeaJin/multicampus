package api;

public class StringLengthEx {

	public static void main(String[] args) {
		String ssn = "77712212";
		int length = ssn.length();
		if(length==13) {
			System.out.println("주민번호가 맞습니다.");
		}else {
			System.out.println("아닙니다.");
		}

	}

}
