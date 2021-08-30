package app;

public class CalculatorEx {
	public int addition(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	public int multiplication(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public int division(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

	public void result(char operator, int n1, int n2) {
		switch (operator) {
		case '+':
			System.out.println(addition(n1, n2));
			break;
		case '-':
			System.out.println(subtract(n1, n2));
			break;
		case '*':
			System.out.println(multiplication(n1, n2));
			break;
		case '/':
			System.out.println(division(n1, n2));
			break;
		}
	}

	public static void main(String[] args) throws java.io.IOException {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.print("Operator:(+,-,*,/) ");
		char oper = (char) System.in.read();
		new CalculatorEx().result(oper, n1, n2);

	}

}
