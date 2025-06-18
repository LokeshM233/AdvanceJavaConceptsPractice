package com.multiThreading.utility;

/**
 * This class extends Thread and overrides the run method to print the current thread's name
 * in an infinite loop with a sleep interval of 100 milliseconds.
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Executing " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}