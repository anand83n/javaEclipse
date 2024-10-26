package Multithreading;

class sleepmth extends Thread {
	
	public void run() {
		
		for(int i = 1; i<5; i++) {
			try{Thread.sleep(500);} 
			
			catch(InterruptedException e) {
				System.out.println(i);
				
				
			}
			
		}
		}
		
		public static void main(String args[]) {
			sleepmth t1 = new sleepmth();
			sleepmth t2 = new sleepmth();
			
			t1.start();
			t2.start();
			
		
	}
}
	
