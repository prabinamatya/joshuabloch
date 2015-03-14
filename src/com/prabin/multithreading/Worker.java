package com.prabin.multithreading;

public class Worker {
	private int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	
	public void run() {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					increment();
				}
			}
		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					increment();
				}
			}
		});
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count is : " + count);
	}

}
