
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

	
	// GETTERS AND SETTERS
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}