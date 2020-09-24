
public class Plane extends Vehicle{

	// ATTRIBUTES
	protected boolean wings;
	
	
	// CONSTRUCTOR
	public Plane(String brand, String model, int age, String colour, boolean wings) {
		super(brand, model, age, colour);
		this.wings = true;
	}
	
	public Plane() {
		super();
	}
	
	// METHODS
		@Override
		public double cost() {
			double cost = 789.50;
			System.out.println("This Plane will cost:" + cost + " plus VAT to be added later.");
			return cost;
		}
	
	
}