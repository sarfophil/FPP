/**
 * 
 */
package homework.quesstion1;

/**
 * @author 610488
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle("blue",2,4);
		shapes[1] = new Circle("red",90.0);
		shapes[2] = new Square("black",25.0,44.0);
		shapes[3] = new Rectangle("voilet",34,49);
		shapes[4] = new Square("pink",54.0,89.9);
		
		printTotal(shapes);

	}
	
	static void printTotal(Shape[] shapes) {
		int count = 1;
		double totalArea = 0.0;
		double totalPerimeter = 0.0;
		for(Shape shape : shapes) {
			int index = count++;
			totalArea += shape.calculateArea();
			totalPerimeter += shape.calculatePerimeter();
		}
		
		System.out.println("Total Area: "+totalArea);
		System.out.println("Total Perimeter: "+totalPerimeter);
	}

}
