import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle("BMW", "3 Series", 2020, "blue");
		Vehicle vehicle2 = new Car("Audi", "Q7", 2018, "Grey", 5, (float) 2.2);
		Vehicle vehicle3 = new Motorcycle();
		Vehicle vehicle4 = new Plane();

		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		vehicles.add(vehicle3);
		vehicles.add(vehicle4);
		
		//System.out.println(vehicles);
		
		double carCost = 0;
		double motorCost = 0;
		double planeCost = 0;
		
		
		for ( Vehicle vehicle : vehicles ) {
			if (vehicle instanceof Car) {
				carCost = vehicle.cost() * 1.2;
			}
			if (vehicle instanceof Motorcycle) {
				motorCost = vehicle.cost() * 1.15;
			}
			if (vehicle instanceof Plane) {
				//System.out.println(vehicle.cost());
				planeCost = vehicle.cost() * 1.6;
			}
		}
		System.out.println("==================");
		
		System.out.println("The overall cost for the car is : " + carCost + " (inc. VAT)");
		System.out.println("The overall cost for the motorbike is : " + motorCost + " (inc. VAT)");
		System.out.println("The overall cost for the plane is : " + planeCost + " (inc. VAT)");
		
		System.out.println("==================");
		
		System.out.println("The final cost: " + (carCost + motorCost + planeCost));
		
		
	}

	public static void addVehicle(String x, String y) {
		
		Vehicle x = new y();
		
	}
		
	
}
