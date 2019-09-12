/**
 * 
 */
package solution;

/**
 * @author 610488
 *
 */
public class Driver {

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
		
		
		for(Figure fig : figures) {
			fig.getFigure();
		}
		System.out.println("\n");
		for(Figure fig: figures) {
			System.out.println();
			System.out.print(fig.getClass().getSimpleName()+": ");
			fig.getFigure();
		}
			

	}

}
