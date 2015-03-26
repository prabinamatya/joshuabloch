package com.prabin.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


//Semaphores are mainly used to limit the number of simultaneous threads that can access a
//resource, but you can also use them to implement deadlock recovery systems. Semaphores with one permit is basically
//a lock that you can unlock from other threads
public class SemaphoreApp {
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 200; i++) {
			executor.submit(new Runnable() {
				
				@Override
				public void run() {
					Connection.getInstance().connect();
				}
			});
		}
		
		executor.shutdown();
		
		executor.awaitTermination(1, TimeUnit.DAYS);
	}

}
