package functions;

import java.util.Scanner;
public class Type3 {

	int a,b,c;
	Scanner sc = new Scanner(System.in);
	
	int mul()
	
	{
		System.out.println("Enter the values of a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a*b;
		return c;
		
		
	}
	public static void main(String[] args) {
		
		Type3 n = new Type3();
		System.out.println("Mul=" + n.mul());
	
		
	}

}
