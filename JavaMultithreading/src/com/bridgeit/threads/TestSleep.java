package com.bridgeit.threads;

public class TestSleep extends Thread {

	public void run() {

		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestSleep t1 = new TestSleep();
		/*TestSleep t2=new TestSleep();
		TestSleep t3=new TestSleep();*/
		t1.start();
		/*t2.start();
		t3.start();*/
	}
}