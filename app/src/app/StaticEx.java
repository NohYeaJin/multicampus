package app;


/* 기타제어자(수정자)
 final:
 	- class: 상속이 안됨
 	- method: 재사용이 안됨
 	- variable 상수화
 	
 static: 
 	- 객체 생성 없이 사용가능(정적 메모리에 생성)
 abstract:
 	- class: 추상메소드
 	- method: 추상메소드 
 	
 	[수정자][접근지정자]...
 * */
public class StaticEx {
	//상수 (암묵적으로 상수는 대문자로만) 
	public final int A = 10;
	public static int B = 20;
	public final static int C = 30;
	public static void method() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		StaticEx se = new StaticEx();
		System.out.println(se.C);
		//System.out.println(new StaticEx().C);
		//위에것과 동일 (but 일회용성임)
		
		//이것도 가능
		//기본은 클래스의 이름으로 찾을 수 있다
		System.out.println(StaticEx.B);
		StaticEx.method();
	}

}
