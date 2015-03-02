package com.prabin.brokenstopthread;

import java.util.concurrent.TimeUnit;

public class StopThread {
	private static boolean stopRequested;
	
	public static void main(String... args) throws InterruptedException {
		Thread  backgroundThread = new Thread(new Runnable() {

			@Override
			public void run() {
				int i = 0;
				while(!stopRequested) {
					System.out.println(i);
					i++;
				}
			}
		});
		
		backgroundThread.start();
		
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}

}
