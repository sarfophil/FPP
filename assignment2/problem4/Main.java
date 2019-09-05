/**
 * 
 */
package com.lessons;

import java.util.Scanner;

/**
 * @author 610488
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter C for Circle\nEnter R for Rectangle\nEnter T for Triangle ");
		String input = scanner.nextLine();

		switch (input) {
		case "R":
			System.out.print(input + "\nEnter the width of the Rectangle ");
			double width = scanner.nextDouble();
			
			System.out.print("Enter the height of the rectangle ");
			double length = scanner.nextDouble();
			
			Rectangle rectangle = new Rectangle(width,length);
			
			System.out.println("The area of Rectangle is : "+rectangle.computeArea());
			break;
		case "C":
			System.out.print(input + "\nEnter the radius of the Circle ");
			double radius = scanner.nextDouble();
			
			Circle circle = new Circle(radius);
			System.out.println("The area of Circle is : "+circle.computeArea());
			break;
		case "T":
			System.out.print(input + "\n Enter the base of the triangle");
			double base = scanner.nextDouble();
			
			System.out.print(input + "\n Enter the height of the triangle");
			double height = scanner.nextDouble();
			
			Triangle triangle = new Triangle(base,height);
			System.out.println("The area of Triangle is : "+triangle.computeArea());
			break;
		default:
			System.out.println("exit");
			break;

		}

		scanner.close();
	}

}
