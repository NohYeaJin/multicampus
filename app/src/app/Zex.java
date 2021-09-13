package app;

public class Zex extends Yex{
	
	protected int i = 30;
	protected String msg = "I am a Z.";
	public void print() {
		System.out.println(msg);
	}
	public void play() {
		System.out.println("Play..."+msg);
	}
	public void doZ() {
		System.out.println("do something in z.");
	}
	public static void main(String[] args) {
		Zex z = new Zex();
		z.test(15);
	}
	
	public void test(int i) {
		Zex z = new Zex();
		//Yex y = new Yex();
		//Xex x = new Xex();
		Yex y = z;
		Xex x = z;
		
		//¹®Á¦
		z.print();
		y.print();
		x.print();
		
		super.print();
		this.play();
		super.play();
		//y.doZ();
		//super.super.print();
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		System.out.println(y.i);
		System.out.println(x.i);
		
		System.out.println(((Yex)this).i);
		System.out.println(((Xex)this).i);
	}

}

class Xex{
	protected int i = 10;
	protected String msg = "I am a X.";
	public void print() {
		System.out.println(msg);
	}
	public void play() {
		System.out.println("Play..."+msg);
	}
	
}

class Yex extends Xex{
	protected int i = 20;
	protected String msg = "I am a Y.";
	public void print() {
		System.out.println(msg);
	}
	public void play() {
		System.out.println("Play..."+msg);
	}
	
}
