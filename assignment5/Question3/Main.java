/**
 * 
 */
package homework3;

/**
 * @author 610488
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Figure[] figures = new Figure[5];
		figures[0] = new UpwardHat();
		figures[1] = new UpwardHat();
		figures[2] = new DownwardHat();
		figures[3] = new FaceMaker();
		figures[4] = new Vertical();
		
		
		for(Figure figs : figures) {
			figs.getFigure();
		}
			

	}

}
