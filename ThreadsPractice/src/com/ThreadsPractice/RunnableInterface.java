package com.ThreadsPractice;

public class RunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " this thread is running");
	}

	public static void main(String[] args) {
		RunnableInterface runnable = new RunnableInterface();
		Thread thread = new Thread(runnable);
		thread.start();
		Thread t1=new Thread(new RunnableInterface());
		t1.start();
	}

}
