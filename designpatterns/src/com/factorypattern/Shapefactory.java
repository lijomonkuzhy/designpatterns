/**
 * 
 */
package com.factorypattern;

/**
 * This is the factory class to generate objects of the concrete classes as
 * requested. Factory class will not be visible to client.
 *
 */
public class Shapefactory {

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equals("Circle")) {
			return new Circle();
		}
		if (shapeType.equals("Square")) {
			return new Square();
		}
		if (shapeType.equals("Triangle")) {
			return new Triangle();
		}
		return null;
	}

}
