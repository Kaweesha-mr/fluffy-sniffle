package qs3;

import java.util.ArrayList;

public class ConsumerThread implements Runnable {
	
	ArrayList <Integer> produce = new ArrayList <Integer>();
	
	
	public ConsumerThread (ArrayList<Integer> queue) {
		
		produce = queue;
		
	}

	@Override
	public void run() {
		
		
		int count =10;
		while(true) {
			
			
			synchronized (produce) {
				System.out.println("consumer Started");
				try {
				produce.remove(0);
				Thread.sleep(1000);
				System.out.println("consumer thread consumes = "+count+" to Queue");
				System.out.println("Elements in Queue " + produce);
				
				produce.notify();
				
					produce.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
			count+=10;
			
			
		}

	}

}
