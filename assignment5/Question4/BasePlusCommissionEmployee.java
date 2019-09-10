/**
 * 
 */
package homework4;

/**
 * @author 610488
 *
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private Double baseSalary;
	private Double payment;
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Double grossSale,
			Double commissionRate,Double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
		this.baseSalary = baseSalary;
		this.payment = baseSalary + (grossSale * commissionRate);
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPayment() {
		return this.payment;
	}
	
	
	

}
