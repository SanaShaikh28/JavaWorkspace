package com.bridgeit.threads;

public class TestCallRun extends Thread {

	@Override
	public void run() {
		System.out.println("running...");
	}

	public static void main(String[] args) {

		TestCallRun t1 = new TestCallRun();
		TestCallRun t2 = new TestCallRun();
		t1.run();
		t2.run();
	}

}
