package quection2;


public class AddNumbers implements Runnable {
	
	DemoThreads lock;
	 int begin;
	 int end;
	 
	 
	
	public AddNumbers(DemoThreads demothread,int begin,int end){
		
		lock = demothread;
		this.begin = begin;
		this.end = end;
	}
	
	
	public void addNumbers(DemoThreads demoThreads, int begin,int end) throws InterruptedException  {
		
		
		synchronized (lock) {
			
			
			for(int i = begin; i<= end; i++) {
					
					Thread.sleep(1000);
					System.out.print(Thread.currentThread().getName());
					System.out.println( " => " +i+ "(+)" +i+ " = " + (i+i));
					lock.notify();
					lock.wait();
			}	
		}
	}


	@Override
	public void run() {
		
		try {
			addNumbers(lock, begin, end);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}

