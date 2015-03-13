package com.prabin.multithreading;

public class AnonymousClass {
	
	public static void main(String[] args) {
		Thread t2 = new Thread(new Runnable() {
			
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
		});
		
		t2.start();
	}

}
