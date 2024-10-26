package functions;

import java.util.Scanner;

public class Type1 {

	public static void main(String[] args) {
		
		Type1 n = new Type1();
		int i,j;
		System.out.println("Enter the values of i and j:");
		Scanner sc= new Scanner(System.in);
		i=sc.nextInt();
		j=sc.nextInt();
		System.out.println("Add="+ n.add(i,j));
		
	}

	int a,b,c;//instance
	int add(int x, int y)
	
	{
		a=x;
		b=y;
		c=a+b;
		
		return c;
	}
}
