package api;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Spring","1");
		map.put("Summer","2");
		map.put("fall","3");
		map.put("winter","4");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵�:");
			String id = scan.next();
			System.out.print("��й�ȣ:");
			String pw = scan.next();
			System.out.println();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
		}
		

	}

}
