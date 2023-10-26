package qs3;

public class PlusThread implements Runnable {
	
	Object lock;
	int start;
	int end;
	
	public PlusThread(Object lock, int start, int end) {
		super();
		this.lock = lock;
		this.start = start;
		this.end = end;
	}
	
	public void addNumbers(Object lock, int start, int end) throws InterruptedException {
		
		
		synchronized (lock) {
			
			for(int i=start; i<end; i++) {
				
				Thread.sleep(1000);
				System.out.print(Thread.currentThread().getName());
				System.out.println( "=>" + i + "+" + i + "="+ (i+i));
				lock.notify();
				lock.wait();
			}
			
		}
		
	}
	
	
	public void run() {
		try {
			addNumbers(lock, start, end);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
