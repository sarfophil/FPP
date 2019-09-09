/**
 * 
 */
package assignment2;

import java.time.LocalDate;

/**
 * @author 610488
 *
 */
public class DeptEmployee {
	
	private String name;
	private LocalDate hireDate;
	private Double salary;
	
	public DeptEmployee(String name,LocalDate hireDate,Double salary) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public Double computeSalary() {
		return salary;
	}

}
