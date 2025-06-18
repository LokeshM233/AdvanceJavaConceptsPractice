package com.multiThreading;

import com.multiThreading.utility.MyThread;


public class DemoMul extends Thread {
	public static void main(String[] args) {
		Thread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Executing " + Thread.currentThread().getName());
	}
}
