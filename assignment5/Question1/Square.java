/**
 * 
 */
package homework.quesstion1;

/**
 * @author 610488
 *
 */
public class Square extends Rectangle{	
	
	protected Double shape;
	
	/**
	 * 
	 */
	public Square(String color, Double width, Double height) {
		super(color, width, height);
		shape = width * height;
	}

}
