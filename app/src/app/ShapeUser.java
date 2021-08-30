package app;

public class ShapeUser {

	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Circle(5);
		shape[1] = new Circle(7);
		shape[2] = new Rect(3,5);
		System.out.println(shape[0].area());
		System.out.println(shape[1].area());
		System.out.println(shape[2].area());
		
		//circumference 출력
		System.out.println(shape[0].circumference());
		System.out.println(shape[1].circumference());
		System.out.println(shape[2].circumference());
		
		//shape[1] 도형의 반지름을 3으로 변경해서 결과 출력
		System.out.println();
		Circle A = (Circle)shape[1];
		A.setRadius(3);
		System.out.println(A.circumference());
		System.out.println(A.area());
	}
}
