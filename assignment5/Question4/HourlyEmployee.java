/**
 * 
 */
package homework4;

/**
 * @author 610488
 *
 */
public class HourlyEmployee extends Employee{
	
	private Double wage;
	private Double hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,Double wage,Double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPayment() {	
		return wage * hours;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}
	
	

}
