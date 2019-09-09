/**
 * 
 */
package assignment2;

import java.time.LocalDate;

/**
 * @author 610488
 *
 */
public class Secretary extends DeptEmployee{
	
	private Double overtimeHours;

	public Secretary(String name, LocalDate hireDate,Double salary,Double overtimeHours) {
		super(name, hireDate,salary);
		this.overtimeHours = overtimeHours;
	}

	public Double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(Double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public Double computeSalary() {
		return super.computeSalary() + (12*overtimeHours);
	}
	
	

}
