package app;

public class ConstructorEx {
	
	int i;
	
	public ConstructorEx() {
		this(100);
		//밑의 constructorEX(int a)를 의미
		//int a 자리에 100이 들어간다 
		//this.i가 생략되어 있음
		i = 50;
	}
	
	public ConstructorEx(int a) {
		this("A");
		System.out.println("a:"+a);
	}
	
	public ConstructorEx(String s) {
		System.out.println("s = "+s);
	}
	
	//this is overloading
	//괄호에 int a 추가 



	public static void main(String[] args) {
		//100이 int a로 전달 된다
		ConstructorEx c= new ConstructorEx();
		//위에 생성자 int a 있는 버젼이 호출되었기 때문에
		//i = 0으로 나온다
		System.out.println(c.i);
		
		//둘다 호출하려면 this를 사용해야 
		
		
		//결론: 매개변수 없이 선언하면 매개변수 없는 생성자 부르고
		//매개변수 있으면 매개 변수 있는걸로 부른다
	}
}
