package api;

import java.io.IOException;

public class IOEx2 {

	public static void main(String[] args) {
		int b = 0, count = 0;
		try {
			b = System.in.read();
			//���ѷ���(ctrlz������ ������ �Է� ���� ���)
			//=> �Է������� b�� ���� �ִ�
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
