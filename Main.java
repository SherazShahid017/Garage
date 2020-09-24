
public class Main {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle("BMW", "3 Series", 2020, "blue");
		Vehicle vehicle2 = new Car("Audi", "Q7", 2018, "Grey", 5, (float) 2.2);
		Vehicle vehicle3 = new Motorcycle();
		Vehicle vehicle4 = new Plane();

		Garage.addVehicle(vehicle1);
		Garage.addVehicle(vehicle2);
		Garage.addVehicle(vehicle3);
		Garage.addVehicle(vehicle4);

		System.out.println("==================");
		
		Garage.removeVehicle("Plane");
		
		Garage.calcCost();
		
		//Garage.removeAll();
		
	}
}
