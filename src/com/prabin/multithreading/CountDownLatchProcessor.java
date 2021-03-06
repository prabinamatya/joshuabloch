package com.prabin.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchProcessor {
	public static void main(String [] args) {
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i = 0; i < 3; i++) {
			executor.submit(new CountDownProcessor(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed: ");
		
	}
}

class CountDownProcessor implements Runnable {
	
	private CountDownLatch latch;
	
	public CountDownProcessor(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		System.out.println("Started: ");
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		latch.countDown();
	}
}
