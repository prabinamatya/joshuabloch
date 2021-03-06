package com.prabin.multithreading;

import java.util.Scanner;

// Instead of synchronized, wait and notify use ReentrantLock 
public class WaitNotify {
	public static void main(String[] args) throws InterruptedException {
		final ProcessWaitNotify processor = new ProcessWaitNotify();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					processor.produce();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					processor.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}

class ProcessWaitNotify  {

	public void produce() throws InterruptedException {
		synchronized(this) {
			System.out.println("Producer thread running....");
			wait();
			System.out.println("Resumed...");
		}
	}

	public void consume() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		
		synchronized (this) {
			System.out.println("Waiting for return key.");
			scanner.nextLine();
			System.out.println("Return key pressed");
			notify();
			Thread.sleep(5000);
		}
		
	}
	
}
