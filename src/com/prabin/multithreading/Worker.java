package com.prabin.multithreading;

public class Worker {
	private int count = 0;
	//no volatile. It just guarantees that all threads see the current state 
	
	public static void main(String... args) {
		Worker worker = new Worker();
		worker.run();
	}
	
	//Only one thread can acquire intrinsic lock at a time. Second thread will have to wait
	public synchronized void increment() {
		count++;
	}
	
	public void run() {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		//wait for the threads to finish
		try {
			thread1.join();
			thread2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count is : " + count);
	}

}
