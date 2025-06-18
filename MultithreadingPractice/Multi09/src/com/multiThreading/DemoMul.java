package com.multiThreading;

import com.multiThreading.service.CounterService;
import com.multiThreading.service.impl.CounterServiceImpl;


public class DemoMul extends Thread {
	private static final int NUM_THREADS = 2;
	private static final int NUM_INCREMENTS = 10;
	private CounterService counterService;

	public DemoMul(CounterService counterService) {
		this.counterService = counterService;
	}

	public static void main(String[] args) throws InterruptedException {
		CounterService counterService = null;
		Thread[] threads = new Thread[NUM_THREADS];
		counterService = new CounterServiceImpl();
		for (int i = 0; i < NUM_THREADS; ++i) {
			threads[i] = new DemoMul(counterService);
			threads[i].start();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < NUM_INCREMENTS; ++i) {
			counterService.incrementCount();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}