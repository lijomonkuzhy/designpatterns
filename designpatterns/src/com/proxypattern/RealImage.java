package com.proxypattern;

/**
 * Class to load and display image
 */
public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadfromDisk(fileName);
	}

	public void display() {
		System.out.println("File name :" + fileName);

	}

	public void loadfromDisk(String fileName) {
		System.out.println("Loading" + fileName);
	}

}
