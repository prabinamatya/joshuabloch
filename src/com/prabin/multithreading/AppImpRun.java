package com.prabin.multithreading;

public class AppImpRun {
	public static void main(String... args) {
		Thread thread1 = new Thread(new Runner());
		System.out.println("thread1 start");
		thread1.start();
	}
}

class Runner2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("hello: " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}