/**
 * 
 */
package homework5;

/**
 * @author 610488
 *
 */
public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	
	public Computer(String manufacturer,String processor,int ramSize,double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}
	
	public int getRamSize() {
		return ramSize;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	} 
	
	public double computePower() {
		return ramSize * processorSpeed;
	}
	
	@Override
	public String toString() {
		return "Manufacturer: "+manufacturer+" Processor:"+processor+" Ram Size: "+processorSpeed+" Power: "+this.computePower();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		Computer computer = (Computer) obj;
		return computer.manufacturer.equals(computer.manufacturer) && computer.processor.equals(computer.processor);
	}
	
	
	
	
}
