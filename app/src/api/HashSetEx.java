package api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("jdbc");
		set.add("java");
		set.add("jsp");
		set.add("servlet");
		int size = set.size();
		System.out.println(size);
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.remove("jsp");
		size = set.size();
		System.out.println(size);
		for(String element:set) {
			System.out.println(element);
		}
		//요소 전부 지워줌
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
