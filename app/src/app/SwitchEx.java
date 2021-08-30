package app;

//switch ~ case 구문
/*
 switch(값)
 case 값 1:
 	구문1;
 	break;(선택)
 	
 case 값 2:
 	구문2;
 	break;(선택)
 	
 case 값 3:
 	구문3;
 	break;(선택)
 	
 default:
 	구문 4;
 	break;(선택)
 
 */

public class SwitchEx {

	public static void main(String[] args) {
		int val = 4;
		switch (val) {
		case 1:
			System.out.println("실행구문1");
			break;

		case 2:
			System.out.println("실행구문2");
			break;

		case 3:
			System.out.println("실행구문3");
			break;

		case 4:
			System.out.println("실행구문4");
			break;

		default:
			System.out.println("기본");
			break;
		}

	}

}
