package tasksj;

public class Maxmin {

	
	public static void main(String[] args) {
		
		int [] numbers = { 1, 2 , 3, 4 , 5};
		
		int min = numbers[0];
		int max = numbers[0];
		
		
		for ( int i = 0; i< numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				
			}
			
			if ( numbers[i] > max) {
				max = numbers[i];
			}
		} 
		
	System.out.println("Minimum value" + min);
	System.out.println("maximum value " + max);

	}

}

