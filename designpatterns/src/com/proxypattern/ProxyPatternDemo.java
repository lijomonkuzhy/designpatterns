package com.proxypattern;

/**
 * Client which uses proxy class method to load and display image
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("file0001.jpg");

		// image will be loaded from disk initially
		image.display();

		// image will not be loaded
		image.display();
	}

}
