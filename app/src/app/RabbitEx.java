package app;

public class RabbitEx extends AnimalEx{
	
	public RabbitEx() {
		this.age = 3;
		this.name="Åä¼øÀÌ";
	}
	
	@Override
	public void walk() {
		System.out.println("±øÃÑ±øÃÑ");
	}
	
	public static void main(String[] args) {
		RabbitEx rabbit = new RabbitEx();
		System.out.println(rabbit.age);
		System.out.println(rabbit.name);
		rabbit.walk();
		

	}

}
