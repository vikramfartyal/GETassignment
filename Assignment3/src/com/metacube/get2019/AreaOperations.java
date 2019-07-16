package com.metacube.get2019;

/**
 * It is a class whose methods are used to find area of different shapes and has
 * an attribute area.
 * @author Khushi
 *
 */
public class AreaOperations {

	double area;

	/**
	 * It is a method which used to find area of triangle.
	 * @param width of triangle
	 * @param height of triangle 
	 * @return area of triangle
	 */
	public double areaOfTriangle(double width, double height) {
		area = 0.5 * width * height;
		return area;
	}

	/**
	 * It is a method which is used find area of rectangle
	 * @param width width of rectangle
	 * @param height height of rectangle
	 * @return area of rectangle
	 */
	public double areaOfRectangle(double width, double height) {
		area = width * height;
		return area;
	}

	/**
	 * It is method which is used to find area of square.
	 * @param width side of square
	 * @return area of square
	 */
	public double areaOfSquare(double width) {
		area = width * width;
		return area;
	}

	/**
	 * It is method which is used to return area of circle
	 * @param radius of circle
	 * @return area of circle
	 */
	public double areaOfCircle(double radius) {
		area = 3.14 * radius * radius;
		return area;
	}
}

