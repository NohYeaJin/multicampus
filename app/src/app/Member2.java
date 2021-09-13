package app;

public class Member2 {
	private String name;
	private int age;

	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member2) {
			// 다형성으로 모든 객체를 다 member로
			Member2 member = (Member2) obj;
			return member.name.equals(name) && (member.age == age);

		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
