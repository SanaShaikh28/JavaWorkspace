package com.bridgeit.threads;

public class TestJoin extends Thread {

	@Override
	public void run() {

		// Thread.currentThread();
		System.out.println(Thread.currentThread());
		System.out.println("Priority Thread:" + Thread.currentThread().getPriority());
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		// System.out.println("hii");
		TestJoin t1 = new TestJoin();
		TestJoin t2 = new TestJoin();
		TestJoin t3 = new TestJoin();

		t1.start();
		System.out.println("Before setting Thread Name:" + t1.getName());

		t1.setName("Thread1 Join");
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Min priority:" + t1.getPriority());

		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Max priority:" + t1.getPriority());

		System.out.println("After setting Thread Name:" + t1.getName());

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
