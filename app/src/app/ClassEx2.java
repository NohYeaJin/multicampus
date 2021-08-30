package app;

public class ClassEx2 {

	public static void main(String[] args) {
		Car a = new Car();
		System.out.println(a.name);
		System.out.println(a.speed);
		System.out.println(a.wheel);
		a.speedUp();
		System.out.println(a.speed);
	}

}

class Car {

	int wheel;
	int speed;
	String name;
	String directionLight;

	public Car() {
		wheel = 4;
		speed = 0;
		name = "티코";
		directionLight = "nothing";
	}
	
	public Car(String name) {
		wheel = 4;
		speed = 0;
		//name = name 불가
		this.name = name;	
		directionLight = "nothing";
	}
	
	//int wheel, int speed 따로 불가
	public Car(int wheel,int speed) {
		this.wheel = wheel;
		this.speed = speed;
		name = "티코";
		directionLight = "nothing";
	}
	

	public void speedUp() {
		speed += 100;
	}

	public void speedBreak() {
		speed = 0;
	}

	public void LeftLight() {
		directionLight = "left";

	}

	public void rightLight() {
		directionLight = "right";

	}
	
	public void display() {
		System.out.println("차 이름: "+ name);
		System.out.println("현재 속도: "+ speed);
		System.out.println("바퀴수: "+ wheel);
	}
	
	public void display(int speed, int wheel, String name) {
		System.out.println("차 이름: "+ this.name);
		System.out.println("현재 속도: "+ this.speed);
		System.out.println("바퀴수: "+ this.wheel);
	}

}
