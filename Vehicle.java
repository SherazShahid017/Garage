
public class Vehicle {

	// ATTRIBUTES
	protected String colour;
	protected int year;
	protected String brand;
	protected String model;
	
	// CONSTRUCTOR
	
	public Vehicle (String brand, String model, int year, String colour) {
		
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.colour = colour;
		
		//System.out.println("This is a car!");
	}
	
	public Vehicle() {
		super();
	}
	
	
	// METHODS
	public double cost() {
		double cost = 0.00;
		System.out.println("This car will cost: " + cost);
		return cost;
	}
}