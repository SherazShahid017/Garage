
public class Motorcycle extends Vehicle {
	
	// ATTRIBUTES
		protected boolean windshield;
		
		
		// CONSTRUCTORS
		public Motorcycle(String brand, String model, int age, String colour, boolean windshield) {
			super(brand, model, age, colour);
			this.windshield = true;
		}
		
		public Motorcycle() {
			super();
		}
		
		// METHODS
		@Override
		public double cost() {
			double cost = 126.30;
			System.out.println("This Motorbike will cost:" + cost + " plus VAT to be added later.");
			return cost;
		}

		// GETTERS AND SETTERS
		public boolean isWindshield() {
			return windshield;
		}

		public void setWindshield(boolean windshield) {
			this.windshield = windshield;
		}

}
