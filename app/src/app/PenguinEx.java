package app;



public class PenguinEx {
	
	int age;
	String name;
	public PenguinEx() {
		this.age = 0;
		this.name = "peng";
	}
	public void walk() {
		System.out.println("�ڶ׵ڶ�");
	}
	

}

class A extends PenguinEx{
	
}

class PigEx{
	int age;
	String name;
	public PigEx() {
		this.age = 0;
		this.name = "piggy";
	}
	
	public void bark() {
		System.out.println("�ܲ�");
	}
}

class CatEx{
	int age;
	String name;
	public CatEx() {
		this.age =0;
		this.name = "meow";
	}
	public void bark() {
		System.out.println("�߿�");
	}
}