package app;

public class AnimalEx {
	int age;
	String name;

	public AnimalEx() {
		this.age = 0;
		this.name = "�����̸�";
	}

	public void bark() {
		System.out.println("���� �����Ҹ�");
	}
	
	public void walk() {
		System.out.println("���� �ȴ¼Ҹ�");
	}
}

abstract class z{
	abstract public void bark();
}

abstract class AnimalAbsEx{
	int age;
	String name;
	
	public AnimalAbsEx() {
		this.age = 0;
		this.name = "name";
	}
	
	public void AnimalMethod() {
		System.out.println("this is ordinary method");
	}
	
	abstract void AnimalAbsMethod();
}


	

