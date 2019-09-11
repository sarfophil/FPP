package homework6_deep;

public class Person implements Cloneable{
	private String name;
	private ComputerClone computer;
	
	
	
	public Person(String name,ComputerClone computer) {
		this.name = name;
		this.computer = computer;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ComputerClone getComputer() {
		return computer;
	}



	public void setComputer(ComputerClone computer) {
		this.computer = computer;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person clone = (Person) super.clone();
		return clone;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+" Computer: "+computer.toString();
	}
	
	
	
	

}
