package Tasksjava;

public class Righttriangle {
    public static void main(String[] args)
    {
 
        // Number of rows
        int N = 6;
 
        // Outer loop runs N times, once for each row
        for (int i = 1; i <= N; i++) {
            // Inner loop prints 'N - i + 1' stars
            for (int j = 1; j <= N - i + 1; j++) {
            	
                System.out.print("*");
            }
         
            System.out.println();
        }
    }
}

