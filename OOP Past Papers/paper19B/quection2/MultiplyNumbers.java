package quection2;

public class MultiplyNumbers implements Runnable {

	DemoThreads lock;
	 int begin;
	 int end;
	
	public MultiplyNumbers(DemoThreads lock, int begin, int end) {
		super();
		this.lock = lock;
		this.begin = begin;
		this.end = end;
	}


	public void multiplyNumbers(DemoThreads lock,int begin,int end) throws InterruptedException {
		
		synchronized (lock) {
			
			for(int i= begin; i<= end; i++) {
	
			
					
					Thread.sleep(1000);
					System.out.print(Thread.currentThread().getName());
					System.out.println(" => "+i+"(*)"+i+ " = "+ (i*i));
					lock.notify();
					lock.wait();
			}	
		}
	}


	@Override
	public void run() {
		
		try {
			multiplyNumbers(lock, begin, end);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
