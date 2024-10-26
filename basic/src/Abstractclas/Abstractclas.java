package Abstractclas;

// public class Abstractclas { 

		// TODO Auto-generated method stub
		
	abstract class Abstractclas {
		
		
			abstract void run();
			
		}
		
		class Honda extends Abstractclas {
			
			void run()
			
		
		
		{
			System.out.println("Running safely");
			
		}
		
		public static void main(String[] args) {
			
		Abstractclas obj = new Honda();
		
		obj.run();
	
		
		
	}

	}




