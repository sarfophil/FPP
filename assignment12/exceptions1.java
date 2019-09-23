package problem5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions1 {

	public static void main(String[] args) {
		initialize();
	}
	
	@SuppressWarnings("resource")
	static void initialize() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a value between 0-100: ");
		try {
			int value = sc.nextInt();
			if (value < 0)
				throw new CustomException("Value is a negative number");
			if (value > 100)
				throw new CustomException("Value should be less than 100");
		} catch (InputMismatchException e) {
			throw new CustomException("Input Mismatch");
		} finally {
			System.out.println("Terminated");
		}
		sc.close();
	}

}

class CustomException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomException() {
		super();
	}
	
	public CustomException(String message) {
		super();
		System.out.println(message);
	}
	
}
