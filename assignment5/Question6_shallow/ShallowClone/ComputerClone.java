/**
 * 
 */
package homework6;

/**
 * @author 610488
 *
 */
public class ComputerClone {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	
	public ComputerClone(String manufacturer,String processor,int ramSize,double processorSpeed) {
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
	
	
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	@Override
	public String toString() {
		return "Manufacturer: "+manufacturer+" Processor:"+processor+" Ram Size: "+processorSpeed+" Power: "+this.computePower();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this != obj) return false; 
		if(getClass() != obj.getClass()) return false;
		ComputerClone computer = (ComputerClone) obj;
		return computer.manufacturer.equals(computer.manufacturer) && computer.processor.equals(computer.processor);
	}
	
	
	
	
}
