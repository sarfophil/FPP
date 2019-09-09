/**
 * 
 */
package assignment2;

import java.time.LocalDate;

/**
 * @author 610488
 *
 */
public class Professor extends DeptEmployee{
	
	private int numberOfPublications;

	public Professor(String name, LocalDate hireDate,Double salary,int numberOfPublications) {
		super(name, hireDate,salary);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	
	
	

}
