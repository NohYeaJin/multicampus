package app;



public class PenguinEx {
	
	int age;
	String name;
	public PenguinEx() {
		this.age = 0;
		this.name = "peng";
	}
	public void walk() {
		System.out.println("第蹲第蹲");
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
		System.out.println("曹曹");
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
		System.out.println("具克");
	}
}