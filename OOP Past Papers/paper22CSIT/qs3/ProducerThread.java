package qs3;

import java.util.ArrayList;

public class ProducerThread implements Runnable {

	ArrayList <Integer> produce = new ArrayList <Integer>();
	
	
	public ProducerThread(ArrayList<Integer> queue) {
		
		produce = queue;
		
	}


	@Override
	public void run() {
		
		
		int count =10;
		while(true) {
			
			
			synchronized (produce) {
				System.out.println("Producer Started");
				
				produce.add(count);
				try {
					Thread.sleep(1000);

				System.out.println("producer adding value = "+count+" to Queue");
				
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
