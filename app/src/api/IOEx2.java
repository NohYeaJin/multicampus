package api;

import java.io.IOException;

public class IOEx2 {

	public static void main(String[] args) {
		int b = 0, count = 0;
		try {
			b = System.in.read();
			//무한루프(ctrlz누르기 전까지 입력 정보 출력)
			//=> 입력정보는 b가 갖고 있다
			while (b != -1) {
				System.out.print((char) b);
				count++;
				b = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(count);
	}

}
