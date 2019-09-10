/**
 * 
 */
package homework4;

/**
 * @author 610488
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee[] employee = new Employee[5];
		employee[0] = new CommissionEmployee("John","Doe","9099",90.0,9.0);
		employee[1] = new SalariedEmployee("Chris","Brown","9099",63.4);
		employee[2] = new HourlyEmployee("James","Bond","0900",44.7,8.3);
		employee[3] = new BasePlusCommissionEmployee("Philip","Sarfo","09003",24.0,9.0,9.0);
		employee[4] = new SalariedEmployee("Mark","Zuckerberg","909893",90.0);
		
		Double totalSalaries = 0.0;
		for(Employee emp : employee) {
			totalSalaries += emp.getPayment();
		}
		System.out.println("Total Salaries of all the Employees : "+totalSalaries);
	}

}
