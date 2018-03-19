package com.bridgeit.reflection;

public class ReflectClass {

	private String s;

	public ReflectClass() {

		s = "Default constructor of Reflect class";
	}

	public void method1() {
		System.out.println("String is:" + s);
	}

	public void method2(int n) {
		System.out.println("" + n);
	}

	private void method3() {
		System.out.println("Private method invoked:");
	}
}
