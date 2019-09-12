/**
 * 
 */
package homework6;

/**
 * @author 610488
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person("Philip",new ComputerClone("Sony","1.2GH",2,1.2));
		
		System.out.println("Before Cloning");
		System.out.println(person);
		
		
		Person personCopy = (Person) person.clone();
		System.out.println("After Cloning");
	    System.out.println(personCopy);
	    
	    person.setName("Kay");
	    System.out.println("After Modifing the Ram Size.");
	    System.out.println(personCopy);
		
		

	}

}
