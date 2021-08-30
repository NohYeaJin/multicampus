package app;

/*
 접근제어자(Access Modifiers)
 -객체의 사용을 제어하기 위한 제어자
 종류) 
 - private, public, protected, default(friendly)
 - private 이 제일 보안 철저
 - 클래스 표현
 	[접근지정자] class 클래스명
 - 메소드 표현
 	[접근 지정자] [자료형] 리턴타입 메소드명(인자들)
 - 변수 표현
 	[접근 지정자] [자료형] 변수명;
 - 생성자 표현
 	[접근 지정자] 클래스명(인자들) 
 */


//같은 패키지 있기 때문에 a,b,c는 접근 가능 
public class EncapEx {

	public static void main(String[] args) {
		Encap encap = new Encap();
		
		System.out.println(encap.a);
		System.out.println(encap.b);
		System.out.println(encap.c);
		//System.out.println(encap.d);
		
		//함수를 통해서 메시지 전달 (상호 interaction)
		encap.setD(10);
		System.out.println(encap.getD());


	}

}

class Encap {
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	public void setD(int d) {
		this.d = d;
		
	}
	public int getD() {
		return this.d;
	}
}
