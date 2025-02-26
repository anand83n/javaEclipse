package Multithreading;

class thpriority extends Thread {
	public void run() {
		System.out.println("running thread name is:"+ Thread.currentThread().getName());
		System.out.println("running thread priority is:"+ Thread.currentThread().getPriority());
	}
	
	public static void main(String args[]) {
		thpriority m1 = new thpriority();
		thpriority m2 = new thpriority();
		m1.setPriority(Thread.MIN_PRIORITY);
		
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
}

