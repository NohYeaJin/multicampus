package api;

public class StringEx {

	public static void main(String[] args) {
		String a = "A";
		String b = "B";
		// Strinc c = new String("C");
		Object o = "abc";
		String s = "abc";
		String s2 = "abc";
		String s3 = null;
		if (o instanceof String) {
			System.out.println("String instance");
		}
		System.out.println(o.toString());
		System.out.println(o.equals(s));
		System.out.println(o == s);
		System.out.println(o == s2);
		String s4 = new String("abc");
		
		//override¿« ∆Øº∫
		System.out.println(o.equals(s4));
		System.out.println(o == s4);
		System.out.println(s == s4);
		System.out.println(s.equals(s4));
		System.out.println(s3 == s4);
	}
}
