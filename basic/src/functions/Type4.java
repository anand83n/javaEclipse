package functions;

import java.util.Scanner;

public class Type4 {

	int a,b,c;
	Scanner sc = new Scanner(System.in);
	void div() {
		
		System.out.print("Enter the values of a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a/b;
		System.out.println("Div="+ c);
		
	}
	public static void main(String[] args) {
		
		Type4 n = new Type4();
		
		n.div();

	}

}
