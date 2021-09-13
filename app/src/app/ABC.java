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

		// 불가능 => 이렇게는 접근 불가 ABC로 BC 접근, BC로 C 접근
		// new BC().print();

		// 이건 가능 => 종속 개념을 이용해서 접근해야
		//new ABC().new BC().print();
		ABC abc = new ABC();
		abc.print();
	}
}
