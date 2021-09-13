package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 ���:
 - ��Ʈ��: �Ϲ������� ������, ��Ŷ ���� �Ϸ��� ���Ӽ��� ���� �帧�� ���Ѵ�. (�帣�� ������ - ���� �帧)
 - ����� ��Ʈ��: �����͸� �а� ���� ������ ���α׷��� ������ �𵨸� �س��� ��
 - ����: �����͸� �ӽ������� ��Ƶδ� ���� 
 
 *���� (character stream) ���� �ֻ��� ��Ʈ��
 - Reader class
  �Է� ��Ʈ��: ���� �����͸� �о���̴� ��Ʈ��
 - writer class
  ��� ��Ʈ��: ���� �����͸� ����ϴ� ��Ʈ��
  
  * ����Ʈ(byte) ����Ʈ �ֻ��� ��Ʈ��
  - InputStream Class
  �Է� ��Ʈ��: ����Ʈ �����͸� �о���� ��Ʈ��
  (�Է� �ֻ��� ��Ʈ��)
  - OutputStream Class
   ��� ��Ʈ��: ����Ʈ �����͸� ����ϱ� ���� ��Ʈ��
   (��� �ֻ��� ��Ʈ��)
 
 */

public class IOEx {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�Է�:");
		char c = ' ';
		try {
			c = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���: " + c);
	}

}
