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
		name = "Ƽ��";
		directionLight = "nothing";
	}
	
	public Car(String name) {
		wheel = 4;
		speed = 0;
		//name = name �Ұ�
		this.name = name;	
		directionLight = "nothing";
	}
	
	//int wheel, int speed ���� �Ұ�
	public Car(int wheel,int speed) {
		this.wheel = wheel;
		this.speed = speed;
		name = "Ƽ��";
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
		System.out.println("�� �̸�: "+ name);
		System.out.println("���� �ӵ�: "+ speed);
		System.out.println("������: "+ wheel);
	}
	
	public void display(int speed, int wheel, String name) {
		System.out.println("�� �̸�: "+ this.name);
		System.out.println("���� �ӵ�: "+ this.speed);
		System.out.println("������: "+ this.wheel);
	}

}
