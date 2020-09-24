
public class Car extends Vehicle {
 
	// ATTRIBUTES
	protected int doors;
	protected float engineSize;
	
	
	// CONSTRUCTORS
	public Car(String brand, String model, int age, String colour, int doors, float engineSize) {
		super(brand, model, age, colour);
		this.doors = doors;
		this.engineSize = engineSize;
	}
	
	public Car() {
		super();
	}
	
	// METHODS
	@Override
	public double cost() {
		double cost = 275.86;
		System.out.println("This car will cost:" + cost + " plus VAT to be added later.");
		return cost;
	}

	// GETTERS AND SETTERS
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

}