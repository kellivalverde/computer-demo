import java.math.BigDecimal;

public class Computer {

	// instance variables (aka object properties)
	// private so the app can't make changes of the pbject properties

	private String brand;
	private String model;
	private double price;
	
	// BigDecimal p = price;
	
	// accessor ("getter") method
	public String getBrand() {
		return brand; // returns a String
	}
	

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price; 
	}
	
	// constructor - builds our object. has to follow the same pattern as the
	// parameters in the ComputerApp class
	public Computer(String brand, String model, double price) {

		// v matches data we declared above
		this.brand = brand; // <--matches constructor
		// ^ currently executing object
		this.model = model;
		this.price = price;
	}

	//methods of behavior - shows action
	
	public void download() {
		System.out.println(this.getBrand() + " " + this.getModel() + " is downloading...");
	}
	
	@Override  // so that latptop.toString() doesn't just print hash code
	public String toString() {
	return 	"Brand: " + this.brand + ", Model: " + this.model + ", Price: " + this.price;
	}
}
	
	
	

