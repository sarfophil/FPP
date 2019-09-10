/**
 * 
 */
package assignment2;

import java.time.LocalDate;
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
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] =  new Professor("John Doe",LocalDate.now(),9000.0,9);
		department[1] =  new Professor("Brain Stark",LocalDate.now(),2400.0,9);
		department[2] =  new Professor("Arya Stark",LocalDate.now(),7800.0,9);
		
		department[3] = new Secretary("James Milner",LocalDate.now(),8900.0,10.0);
		department[4] = new Secretary("Neymar Dos Santos",LocalDate.now(),9000.0,9.0);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you wish to see sum of all Professor and Secretary.(y/n)");
		String response = scanner.nextLine();
		if(response.equals("y")) {
			System.out.println("Total of all salaries: "+findTotal(department));
		}else {
			System.out.println("Terminated.");
		}
		scanner.close();
	}
	
	static Double findTotal(DeptEmployee[] department) {
		Double total = 0.0;
		for(DeptEmployee deptEmployee : department) {
			total += deptEmployee.computeSalary();
		}
		return total;
	}
	
	

}
