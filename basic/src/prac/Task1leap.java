package prac;

import java.util.Scanner;

public class Task1leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		int year = obj.nextInt();
		
		
		if (year % 4 == 1) {
			
			System.out.println(year + " It is a leap year");
			
		}
		
		else {
			
			
			System.out.println(year + " It is not a leap year");
		}
	}

}
