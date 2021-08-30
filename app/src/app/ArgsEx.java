package app;

public class ArgsEx {

	public static void main(String[] args) {
		String str = args[0];
		int su = Integer.parseInt(str);
		boolean result = su %2 == 0;
		if(result) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
			

	}

}
