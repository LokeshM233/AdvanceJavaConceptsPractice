package com.multiThreading.service.impl;

import com.multiThreading.service.CounterService;


public class CounterServiceImpl3 implements CounterService {
	private int count;

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void incrementCount() {
		synchronized (this) {
			++count;
		}
	}
}
