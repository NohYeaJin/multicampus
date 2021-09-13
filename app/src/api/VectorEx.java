package api;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector vc = new Vector();

		// 객체 저장
		vc.add("홍길동");
		vc.add("김자바");
		vc.add("이자바");

		// 객체 추출
		String str1 = (String) vc.get(0);
		String str2 = (String) vc.get(1);
		String str3 = (String) vc.get(2);

		// 출력
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.print("이름을 입력하세요: ");
		String name = new Scanner(System.in).next();
		int index = vc.indexOf(name);
		if (vc.contains(name)) {
			System.out.println("검색 결과 있음" + vc.get(index));
			if(vc.remove(name)) {
				System.out.println("삭제완료");
			}
			System.out.println("<출력 결과 표현1>");
			for(int i = 0;i<vc.size();i++) {
				String str = (String)vc.get(i);
				System.out.println(str);	
			}
			System.out.println("<출력 결과 표현2>");
			Iterator it = vc.iterator();
			while(it.hasNext()) {
				String e = (String)it.next();
				System.out.println(e);
			}
			System.out.println("<출력 결과 표현3>");
			Enumeration e = vc.elements();
			while(e.hasMoreElements()) {
				String str = (String)e.nextElement();
				System.out.println(str);
			}
			
			System.out.println("<출력 결과 표현4>");
			for(Object obj:vc) {
				String str = (String)obj;
				System.out.println(str);
			}
		}else {
			System.out.println("검색결과 없음");
		}
	}

}
