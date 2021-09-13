package app;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("a1","��1");
		map.put("a1","��2");
		//�̰��, ��1�� ���������. ��2�� �Ǿ������
		map.put("a3","��3");
		map.put("a4","��4");
		map.put("a5","��5");
		String str1 = map.get("a1");
		//value���� ���´�
		System.out.println(str1);
		
		//��� key���� �ߺ� ���� set�� �������ڴ�. 
		//����� �� 
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()) {
			String key = it.next();
			//���������� ������ �ʴ´�, �����ϰ� ���´�
			System.out.println(key);
			String value = map.get(key);
			System.out.println(value);
		}
		map.remove("a1");
		System.out.println("�� Entry ��:"+ map.size());
		
		keyset = map.keySet();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			String value = map.get(key);
			System.out.println(value);
		}
		
	}

}
