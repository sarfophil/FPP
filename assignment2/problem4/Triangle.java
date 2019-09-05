/**
 * 
 */
package com.lessons;

/**
 * @author 610488
 *
 */
public final class Triangle {
	private final double base;
	private final double height;
	
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
	}
	
	public double computeArea() {
		return (1/2)*base*height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
	

}
