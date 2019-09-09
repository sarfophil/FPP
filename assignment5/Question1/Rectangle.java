/**
 * 
 */
package homework.quesstion1;

/**
 * @author 610488
 *
 */
public class Rectangle extends Shape{
	
	protected double width;
	protected double height;
	
	/**
	 * 
	 */
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public Double calculateArea() {
		return width * height;
	}
	
	@Override
	public Double calculatePerimeter() {
		return 2 * width + 2 * height;
	}

	
	

}
