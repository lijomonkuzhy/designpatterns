package com.factorypattern;

/**
 * Clients can use this class is to draw any shape. This class will call factory
 * class to instantiate the corresponding objects as required.
 */
public class DrawShape {

	public static void main(String[] args) {
		Shapefactory shapefactory = new Shapefactory();

		// Draw Circle
		shapefactory.getShape("Circle").draw();

		// Draw triangle
		shapefactory.getShape("Triangle").draw();
		
		// Draw Square
		shapefactory.getShape("Square").draw();


	}

}
