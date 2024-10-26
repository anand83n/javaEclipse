package functions;

import java.util.Scanner;

public class Type2 {
	
	int a,b,c;
	void sub(int x, int y)
	{
		a=x;
		b=y;
		c=a-b;
		
		System.out.println("sub="+ c);
		

	}

	public static void main(String[] args) {
		
		Type2 n = new Type2();
		int i,j;
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		j=sc.nextInt();
		n.sub(i, j);

	}

}
