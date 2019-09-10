/**
 * 
 */
package homework4;

/**
 * @author 610488
 *
 */
public class SalariedEmployee extends Employee{
	
	private Double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,Double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPayment() {
		return weeklySalary;
	}

	public Double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(Double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	

}
