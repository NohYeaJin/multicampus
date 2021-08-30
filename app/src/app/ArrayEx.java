package app;

/*
 배열(array)
 - 같은 자료형의 데이터를 여러개 저장하기 위한 메모리 공간을 말함.
 - 생성된 메모리 공간에 index를 이용하여 각 기억장소를 구분함.
 - 배열 크기는 length를 사용하여 구함.
 	int[] arr -> int형 들을 담는 배열
 	int[] arr = new int[length];
 	int[] arr = new int[2];
 	->공간이 2개 생김 , 실행했을 때 에러가 난다, 문법은 맞음
 	
 	이떄 arr를 출력하면 배열의 주소값 
 	참조하고 있다, 나는 배열의 값을 사용할 수 있다
 	
 	int []c = {10,20};
 	int []d = new int[]{10,20}
 	위에꺼랑 같음
 	
 	int[0] = 10;
 	0번째 index에 들어있는 값이 10
 	 
 */
public class ArrayEx {

	public static void main(String[] args) {

		
		/*
		// ex1
		int[] arr = new int[2];
		System.out.println(arr[0]);
		arr[0] = 10;
		arr[1] = 20;
		System.out.println(arr[0]);

		// ex2
		int[] b = { 20, 20 };
		System.out.println(b[0]);
		// arr[0] , arr[1] 둘다 0임

		// ex3
		int[] c = new int[] { 10, 20 };
		System.out.println(c[0]);
		System.out.println(c[1]);

		// 반복문 사용으로 출력하시오.
		int[] arr2 = new int[10];
		for (int i = 0; i < 10; i++) {
			arr2[i] = (i * 10) + 1;
		}
		
		//향상된 for문으로 출력하는 배열 
		for(int v: arr2) {
			System.out.println(v);
		}
		
		//배열의 길이 
		int len = arr.length;
		*/
		//문제 배열범위  구구단을 출력 int[] dan = {3,5,9};
		int[] dan = {3,5,9};
		for(int i = 0;i<dan.length;i++) {
			for(int j = 1;j<=9;j++) {
				System.out.print(dan[i]+" X "+j+" = "+dan[i]*j + "\t");
			}
			System.out.println();
		}
	}

}
