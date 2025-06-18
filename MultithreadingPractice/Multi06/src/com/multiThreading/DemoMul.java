package com.multiThreading;

import com.multiThreading.thread.MyThreadClass1;
import com.multiThreading.thread.MyThreadClass2;
import com.multiThreading.utility.SharedResource;

public class DemoMul extends Thread {
	public static void main(String[] args) {
		SharedResource resources = new SharedResource("resource1", "resource2");
		Thread thread1 = new Thread(new MyThreadClass1(resources));
		Thread thread2 = new Thread(new MyThreadClass2(resources));
		thread1.start();
		thread2.start();
	}
}
