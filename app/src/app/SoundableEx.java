package app;

public class SoundableEx {

	private static void printSound(Soundable soundable) {
		//이 때 인스턴스의 타입은 soundable이다. cat 타입이 아님 
		System.out.println(soundable.sound());

	}
	
	public static void main(String[] args) {
		//다형성
		printSound(new CatEx2());
		printSound(new DogEx());

	}

}
