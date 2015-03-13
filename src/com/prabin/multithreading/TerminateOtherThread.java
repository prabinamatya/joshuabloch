package com.prabin.multithreading;

import java.util.Scanner;

public class TerminateOtherThread {
	public static void main(String[] args) {
		Processor pro = new Processor();
		pro.start();
		
		new Scanner(System.in).nextLine();
		
		pro.shutdown();
	}

}

class Processor extends Thread {
	private volatile boolean running = true;
	
	public void run() {
		while(running) {
			System.out.println("Running");
			try {
				Thread.sleep(60);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}
}
