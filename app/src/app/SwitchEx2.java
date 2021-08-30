package app;

import java.io.IOException;

public class SwitchEx2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Yes/No(Y,N) ?");
		char c = (char)System.in.read();
		switch(c) {
		
		case 'Y':			
		case 'y':
			System.out.println("Yes");
			break;
			
		case 'N':			
		case 'n':
			System.out.println("No");
			break;
			
		default:
			System.out.println("Wrong answer");
		}
		

	}

}
