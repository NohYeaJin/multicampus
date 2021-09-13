package app;


/*
 클래스처럼 보이게 하는 상수
 서로 관련 있는 상수들을 모아 심볼릭한 명칭의 집합으로 정의한 것
 Enum 클래스형을 기반으로 한 클래스형 선언
 새로운 열거형을 선언하면, 내부적으로 Enum 클래스형 기반의 새로운 클래스형이 만들어짐 
 */
public class EnumEx {
	
	public static void main(String[] args) {
		//String seoul = City.Seoul;
		//System.out.println(seoul);
		City c1 = City.valueOf("서울");
		System.out.println(c1);
		
		//모든 상수를 출력하라는 반복문
		for(City city: City.values()) {
			System.out.println(city);
		}
	}
	
	//상수만 들어갈 수 있다
	public enum City{
		서울, 부산, 대구, 광주, 대전
	}
}

class City{
	public static final String Seoul = "서울";
	public final static String Busan = "부산";
	public final static String Daegu = "대구";
	public final static String Gwangju = "광주";
	public final static String Daejeon = "대전";
}
