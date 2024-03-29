package problem3;

import java.util.Objects;

/** NOTE: You must override equals in this class */
public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(Employee.class != obj.getClass()) return false;
		Employee employee = (Employee) obj;
		return getName().equals(employee.getName()) 
				&& getSalary() == employee.getSalary();
	}
	
	@Override
		public int hashCode() {
			return Objects.hash(name,salary);
		}
}
