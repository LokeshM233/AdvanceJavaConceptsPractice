package com.ThreadsPractice;

public class NormalThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" this thread is runing");
	}
	public static void main(String[] args) {
		NormalThread t1= new NormalThread();
		t1.start();
	}
}
