package app;

public class RabbitEx extends AnimalEx{
	
	public RabbitEx() {
		this.age = 3;
		this.name="�����";
	}
	
	@Override
	public void walk() {
		System.out.println("���ѱ���");
	}
	
	public static void main(String[] args) {
		RabbitEx rabbit = new RabbitEx();
		System.out.println(rabbit.age);
		System.out.println(rabbit.name);
		rabbit.walk();
		

	}

}
