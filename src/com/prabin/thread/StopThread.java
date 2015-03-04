package com.prabin.thread;

import java.util.concurrent.TimeUnit;

public class StopThread {
	
	public static boolean stopRequested;
	
	public static void main(String... args ) throws InterruptedException {
		Thread backGroundThread = new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while(!stopRequested) {
					i++;
					System.out.println(i);
				}
			}
		});
		
		backGroundThread.start();
		
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}

}
