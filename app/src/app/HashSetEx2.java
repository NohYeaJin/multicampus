package app;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<Member2> set = new HashSet<>();
		set.add(new Member2("ȫ�浿",10));
		set.add(new Member2("ȫ�浿",10));
		
		System.out.println(set.size());
		System.out.println(new Member2("ȫ�浿",10).equals(new Member2("ȫ�浿",10)));
		System.out.println(new Member2("ȫ�浿",10).hashCode());
	}

}
