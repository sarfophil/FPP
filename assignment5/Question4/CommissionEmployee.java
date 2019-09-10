/**
 * 
 */
package homework4;

/**
 * @author 610488
 *
 */
public class CommissionEmployee extends Employee{
	
	private Double grossSale;
	private Double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,Double grossSale,Double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}

	@Override
	public double getPayment() {
		return grossSale * commissionRate;
	}

	public Double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(Double grossSale) {
		this.grossSale = grossSale;
	}

	public Double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	public String toString() {
		return "Gross Sale: "+grossSale+"\n Commission Rate :"+commissionRate;
	}
		
}
