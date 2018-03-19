package com.bridgeit.threads;

public class MultiRun implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running.. ");

	}

	public static void main(String[] args) {

		MultiRun m = new MultiRun();
		Thread t1 = new Thread(m);
		t1.start();
		System.out.println("Thread status before:" + t1.getState());
		System.out.println("Thread is alive:?" + t1.isAlive());
		System.out.println("Thread ID:" + t1.getId());
		System.out.println("Thread name:" + t1.getName());
		// System.out.println(t1.isDaemon());
		System.out.println("Thread class:" + t1.getClass());
		System.out.println("Thread state after:" + t1.getState());
	}
}
