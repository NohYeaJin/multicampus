package app;

//�ݺ���(for��)
/*
 for(��������(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
 	���౸��;
 }
 */

public class ForEx {
	//����2 1~100���� ���ϱ�, ¦���� �� ���,Ȧ���� �� ��� 
	public static void main(String[] args) {
		int zzaksutotal = 0;
		int holsutotal = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				zzaksutotal += i;
			}else {
				holsutotal += i;
			}

		}
		
		System.out.println("¦�� ��:" + zzaksutotal);
		System.out.println("Ȧ�� ��:" + holsutotal);

	}

}
