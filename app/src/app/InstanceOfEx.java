package app;

public class InstanceOfEx {
	//´Ù ¸ÂÀ½
	public static void main(String[] args) {
		Child child = new Child();
		if(child instanceof InterfaceZ) {
			System.out.println("child is instance of interface");
		}
		if(child instanceof Object) {
			System.out.println("child is instance of object");
		}
		if(child instanceof Parent) {
			System.out.println("child is instance of parent");
		}
		if(child instanceof Child) {
			System.out.println("child is instance of child");
		}
		
		
		if(child instanceof InterfaceZ) {
			System.out.println("child is instance of interface");
		}
		else if(child instanceof Object) {
			System.out.println("child is instance of object");
		}
		else if(child instanceof Parent) {
			System.out.println("child is instance of parent");
		}
		else if(child instanceof Child) {
			System.out.println("child is instance of child");
		}
	}

}
interface InterfaceZ{}

class Parent implements InterfaceZ{}

class Child extends Parent{}