package com.singletonpattern;

/**
 * Singleton class will have only a single object which has to be used across
 * the project.
 */
public class SingletonClass {

	// create a static singleton object
	public static SingletonClass singletonObject = new SingletonClass();

	// make the constructor private so that it cannot be invoked from any other
	// class.
	private SingletonClass() {

	}

	// get the only object available. Make this static so that it can be
	// accessed without object.

	public static SingletonClass getSingletonObject() {
		return singletonObject;
	}

	public void showMessage(String str) {
		System.out.println(str);
	}

}
