package com.multiThreading;

import com.multiThreading.utility.MyThread;


public class DemoMul2 extends Thread {
	public static void main(String[] args) {
		Thread thread = new MyThread();
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Executing " + Thread.currentThread().getName());
	}
}
