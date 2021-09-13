package app;

public class ABC {
	public String msg = "A";

	public void print() {
		BC bc = new BC();
		bc.print();
	}

	public class BC {
		public String msg = "B";

		public void print() {
			C c = new C();
			c.print();
		}

		public class C {
			public String msg = "C";

			public void print() {
				System.out.println(msg);
				System.out.println(this.msg);
				System.out.println(BC.this.msg);
				System.out.println(ABC.this.msg);

			}

		}
	}

	public static void main(String[] args) {

		// �Ұ��� => �̷��Դ� ���� �Ұ� ABC�� BC ����, BC�� C ����
		// new BC().print();

		// �̰� ���� => ���� ������ �̿��ؼ� �����ؾ�
		//new ABC().new BC().print();
		ABC abc = new ABC();
		abc.print();
	}
}
