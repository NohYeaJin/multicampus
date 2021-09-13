package app;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("a1","값1");
		map.put("a1","값2");
		//이경우, 값1이 덮어씌워진다. 값2가 되어버린다
		map.put("a3","값3");
		map.put("a4","값4");
		map.put("a5","값5");
		String str1 = map.get("a1");
		//value값이 나온다
		System.out.println(str1);
		
		//모든 key값을 중복 없이 set에 가져오겠다. 
		//덮어쓰는 것 
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()) {
			String key = it.next();
			//순차적으로 나오지 않는다, 랜덤하게 나온다
			System.out.println(key);
			String value = map.get(key);
			System.out.println(value);
		}
		map.remove("a1");
		System.out.println("총 Entry 수:"+ map.size());
		
		keyset = map.keySet();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			String value = map.get(key);
			System.out.println(value);
		}
		
	}

}
