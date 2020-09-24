import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	// CREATE ARRAY
	private static List<Vehicle> vehicles = new ArrayList<>();
	
	
	public Garage() {
		super();
	}
	
	// ADD VEHICLES (add to ArrayList)
	public static boolean addVehicle(Vehicle vehicle) {
		return vehicles.add(vehicle);	
	}
	
	// REMOVE VEHICLE BY TYPE
	public static void removeVehicle(String type) {
		if ( "Car".equalsIgnoreCase(type)) {
			vehicles.remove("Car");
		}
		else if ( "Motorcycle".equalsIgnoreCase(type)) {
			vehicles.remove("Motorcycle");
		}
		else if ( "PLane".equalsIgnoreCase(type)) {
			vehicles.remove("Plane");
		}
	}
	
	// REMOVE ALL VEHICLES
	public static void removeAll() {
		vehicles.removeAll(vehicles);
	}
	
	
	// CALCULATE COST
	public static void calcCost() {
			
		double carCost = 0;
		double motorCost = 0;
		double planeCost = 0;
			
			
		for ( Vehicle v : vehicles ) {
			if (v instanceof Car) {
				carCost = v.cost() * 1.2;
			}
			if (v instanceof Motorcycle) {
				motorCost = v.cost() * 1.15;
			}
			if (v instanceof Plane) {
				planeCost = v.cost() * 1.6;
			}
		}
		System.out.println("The overall cost for the car is : " + carCost + " (inc. VAT)");
		System.out.println("The overall cost for the motorbike is : " + motorCost + " (inc. VAT)");
		System.out.println("The overall cost for the plane is : " + planeCost + " (inc. VAT)");
		
		System.out.println("==================");
		
		System.out.println("The final cost: " + (carCost + motorCost + planeCost));
	}
}