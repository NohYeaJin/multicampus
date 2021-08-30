package app;

public class SuperCarEx extends Car{
	
	public SuperCarEx() {
		this.directionLight = "left";
		this.name = "mycar";
		this.speed = 100;
		this.wheel = 8;
	}
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void speedBreak() {
		speed  = 0;
	}
	public static void main(String[] args) {
		SuperCarEx supercar = new SuperCarEx();
		System.out.println(supercar.name);
		System.out.println(supercar.wheel);
		System.out.println(supercar.speed);
		supercar.speedUp();
		supercar.speedUp();
		System.out.println(supercar.speed);
		supercar.speedBreak();
		System.out.println(supercar.speed);
	}

}
