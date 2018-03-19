package com.bridgeit.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws Exception {

		ReflectClass obj = new ReflectClass();
		Class cls = obj.getClass();
		System.out.println("Class name is:" + " " + cls.getName());

		Constructor constructor = cls.getConstructor();
		System.out.println("Constructor of class:" + constructor);

		Method[] methods = cls.getMethods();
		for (Method method2 : methods) {
			System.out.println(method2.getName());
		}
	}
}
