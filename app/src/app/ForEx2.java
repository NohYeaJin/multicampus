package app;

/*
 for(��������(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
 	���౸��1;
 	for(��������(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
 		���� ����;
 }
 }
 */
//������ ���, ���η�, ���η�
public class ForEx2 {
	/*
	 * public static void main(String[] args) { int result; for (int i = 1; i < 10;
	 * i++) { for (int j = 2; j < 10; j++) { result = i * j;
	 * System.out.print(j+" X "+i+" = "+result+"\t"); } System.out.println(); }
	 * 
	 * }
	 */

	// ���� = �� �� �ִ� �͵� �غ���
	// �ؿ��� �� �ݴ�� ���
	// ������ �����?
	/*
	 * public static void main(String[] args) { for (int i = 5; i > 0; i--) { for
	 * (int j = 1; j <= i; j++) { System.out.print("*"); } System.out.println(); } }
	 */

	// ������
	/*
	public static void main(String[] args) {
		int length = 3;
		int k;
		for (int i = 0; i < (length + 1); i++) {
			for (int j = length; j > i; j--) {
				System.out.print(" ");
			}
			k = i * 2 + 1;
			for (int m = 1; m <= k; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < (length + 1); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			k = (length - i) * 2 - 1;
			for (int m = 0; m < k; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	*/
	
	//����纯��
	public static void main(String[] args) {
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k<5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
