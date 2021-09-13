package api;

import java.util.ArrayList;

/* Collection
 객체를 담을 수 있는 기억장소, 여러가지 자료들
 적절한 형태로 처리하고 저장하는 저장형태(묶음)의 자료구조.
 */

public class ArrayListEx {

	public static void main(String[] args) {
		// 1은 별로 절대적이지 않다, resizing이 되기 때문
		// 몇개씩 증가할지도 설정할 수 있음
		// ArrayList<String> al = new ArrayList<>(1);
		ArrayList al = new ArrayList(); // <- 이것도 가능 <>는 권장
		// = int[] arr = new int[1];
		// 절대적

		// 메소드를 통해서 집어넣는다.
		al.add("Java");
		al.add("JDBC");
		al.add("Servlet");
		// 2번째 자리에 넣음, 기존에 있던거 밀려남
		al.add(2, "jsp");
		// size는 capacity가 아닌, 실제 값을 가지고 있는 개수를 가져온다.
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
