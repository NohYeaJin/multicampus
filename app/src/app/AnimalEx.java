package app;

public class AnimalEx {
	int age;
	String name;

	public AnimalEx() {
		this.age = 0;
		this.name = "동물이름";
	}

	public void bark() {
		System.out.println("동물 울음소리");
	}
	
	public void walk() {
		System.out.println("동물 걷는소리");
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


	

