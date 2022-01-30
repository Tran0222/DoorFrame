/* Student Name: Jennifer Tran
 * Lab Professor: Mohammed Patoary
 * Due Date: October 8,2021
 * Description: This Door class will store the Doors data and weather strip calculation
 */

public class Door { // start of Door class
	// instance variables
	private double height;
	private double width;
	private double length;
	private double weatherStrip;
	private double packageNeeded;

	
// default constructor --->values = 0
	public Door() {
		height = width = length = weatherStrip = packageNeeded = 0;
		
		
	}
	
	// overload constructor
	
	public Door(double height,double width, double length, double weatherStrip, double packageNeeded) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.weatherStrip = weatherStrip;
		this.packageNeeded = packageNeeded;
	}
	
	
	//Setters & Getters

	public double getHeight() { // height accessor
		return height;
	}

	public void setHeight(double height) { // height mutator
		this.height = height;
	}

	public double getWidth() { // width accessor
		return width;
	}

	public void setWidth(double width) { // width mutator
		this.width = width;
	}

	public double getLength() { // length accessor
		return length;
	}

	public void setLength(double length) { // length mutator
		this.length = length;
	}

	public double getWeatherStrip() { // weatherStrip accessor
		return weatherStrip;
	}

	public void setWeatherStrip(double weatherStrip) { // weatherStrip mutator
		this.weatherStrip = weatherStrip;
	}

	public double getPackageNeeded() { // packagesNeeded accessor
		return packageNeeded;
	}

	public void setPackageNeeded(double packageNeeded) { // packagesNeeded mutator
		this.packageNeeded = packageNeeded;
	}
	
	

	
	

	// worker method: returns value of weather strip in cm
	public double weatherStripTotal() { 
		return 2 * height + width;
	}
	
	
	
	
}// end of Door class
	
	

