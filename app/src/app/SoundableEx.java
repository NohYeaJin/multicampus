package app;

public class SoundableEx {

	private static void printSound(Soundable soundable) {
		//�� �� �ν��Ͻ��� Ÿ���� soundable�̴�. cat Ÿ���� �ƴ� 
		System.out.println(soundable.sound());

	}
	
	public static void main(String[] args) {
		//������
		printSound(new CatEx2());
		printSound(new DogEx());

	}

}
