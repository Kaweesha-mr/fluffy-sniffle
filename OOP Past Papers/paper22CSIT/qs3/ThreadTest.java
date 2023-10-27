package qs3;

import java.util.ArrayList;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> queue = new ArrayList <Integer> ();
		Thread procuderThread = new Thread(new ProducerThread(queue));
		Thread consumer = new Thread(new ConsumerThread(queue));
		
		procuderThread.start();
		consumer.start();
		
		System.out.println("Startting");
		
	}
	
	
	
}
