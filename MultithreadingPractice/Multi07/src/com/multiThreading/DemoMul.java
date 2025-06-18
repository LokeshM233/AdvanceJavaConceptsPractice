package com.multiThreading;

import com.multiThreading.utility.Criminal;
import com.multiThreading.utility.Police;


public class DemoMul extends Thread {
	private static final Police POLICE = new Police();
	private static final Criminal CRIMINAL = new Criminal();

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				POLICE.giveRansom(CRIMINAL);
			}
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				CRIMINAL.releaseHostage(POLICE);
			}
		});
		t2.start();
	}
}
