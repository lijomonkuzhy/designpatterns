package com.proxypattern;

/**
 * Proxy class which uses Real class's display method to load and display image
 */
public class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();

	}

}
