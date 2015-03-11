package com.prabin.multithreading;

public class Application  {

	public static void main(String... ars) {
	
		Runner runner1 = new Runner();
		System.out.println("runner1");
		runner1.start();
		
		Runner runner2 = new Runner();
		System.out.println("runner2");
		runner2.start();
	}
	
}

class Runner extends Thread {
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
