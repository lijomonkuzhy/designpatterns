package com.singletonpattern;

/**
 * This class will use the singleton object of Singleton class
 */
public class SingletonUsage {

	public static void main(String[] args) {
		// Error: constructor is not visible.
		// SingletonClass singletonObject = new SingletonClass();

		SingletonClass singletonObject = SingletonClass.getSingletonObject();
		singletonObject.showMessage("SingletonDemo");

	}

}
