package app;


/*
 Ŭ����ó�� ���̰� �ϴ� ���
 ���� ���� �ִ� ������� ��� �ɺ����� ��Ī�� �������� ������ ��
 Enum Ŭ�������� ������� �� Ŭ������ ����
 ���ο� �������� �����ϸ�, ���������� Enum Ŭ������ ����� ���ο� Ŭ�������� ������� 
 */
public class EnumEx {
	
	public static void main(String[] args) {
		//String seoul = City.Seoul;
		//System.out.println(seoul);
		City c1 = City.valueOf("����");
		System.out.println(c1);
		
		//��� ����� ����϶�� �ݺ���
		for(City city: City.values()) {
			System.out.println(city);
		}
	}
	
	//����� �� �� �ִ�
	public enum City{
		����, �λ�, �뱸, ����, ����
	}
}

class City{
	public static final String Seoul = "����";
	public final static String Busan = "�λ�";
	public final static String Daegu = "�뱸";
	public final static String Gwangju = "����";
	public final static String Daejeon = "����";
}
