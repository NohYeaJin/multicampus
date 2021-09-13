package api;

import java.util.ArrayList;

/* Collection
 ��ü�� ���� �� �ִ� ������, �������� �ڷ��
 ������ ���·� ó���ϰ� �����ϴ� ��������(����)�� �ڷᱸ��.
 */

public class ArrayListEx {

	public static void main(String[] args) {
		// 1�� ���� ���������� �ʴ�, resizing�� �Ǳ� ����
		// ��� ���������� ������ �� ����
		// ArrayList<String> al = new ArrayList<>(1);
		ArrayList al = new ArrayList(); // <- �̰͵� ���� <>�� ����
		// = int[] arr = new int[1];
		// ������

		// �޼ҵ带 ���ؼ� ����ִ´�.
		al.add("Java");
		al.add("JDBC");
		al.add("Servlet");
		// 2��° �ڸ��� ����, ������ �ִ��� �з���
		al.add(2, "jsp");
		// size�� capacity�� �ƴ�, ���� ���� ������ �ִ� ������ �����´�.
		System.out.println(al.size());
		System.out.println(al.get(3));
		for (int i = 0; i < al.size(); i++) {
			Object str = al.get(i);
			String str1 = (String) al.get(i);
			System.out.println(str);

		}
		al.remove(1);
		Object skill = (String) al.get(2);
		
		for(Object obj:al) {
			System.out.println((String)obj);
			System.out.println(obj.toString());
			System.out.println(obj);
		}
			

	}

}
