/**
 * 
 */
package homework.quesstion1;

/**
 * @author 610488
 *
 */
public class Circle extends Shape{

	protected Double radius;
	/**
	 * 
	 */
	public Circle(String color,Double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public Double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public Double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	
	

}
