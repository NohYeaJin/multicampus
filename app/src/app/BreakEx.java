package app;

public class BreakEx {

	public static void main(String[] args) {
		int i = 0;
		boolean result = true;
		do {
			i++;
			if (result) {
				System.out.println("실행구문");
				if (i == 5) {
					result = false;
				}
				if (!result) {
					System.out.println("실행 구문 종료합니다.");
					break;
				}
			} else {
				//break문을 만나서 빠져나갔기 때문에 else문 안의 구문은 실행되지 않는다. 
				System.out.println("i = " + i);
			}
		} while (i < 10);
	}
}
