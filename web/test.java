import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

# This class file is for an example in Java Collections Framework
# This is a project I did under Java tutorial
#
public class JCFComDataClass {

	public static String[] vehicles = {"Ford", "Chevrolet", "Volkswagen", "Volvo", "Mercedes"};
	public static String[][] driversList = {{"Balu", "Govindan", "Mahendra"}, {"Ganepathy", "Solomon", "Thozhan", "Sakthivel"},
		{"Kathir", "Simon", "Islamiyah"}, {"David", "Dhillu", "Babu"}, {"Raj", "Aasan", "Vasuki"}};

	public static void main(String[] args) {
		
		Map<String, Set<String>> personnel = new HashMap<>();
		
		for(int i=0; i<vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] drivers = driversList[i];
			Set<String> driverSet = new LinkedHashSet<String>();
			
			for(String driver: drivers) {
				driverSet.add(driver);
			}
			System.out.println("Vehicle is "+vehicle+" and its drivers are "+driverSet+"\n");
			
			//Assigning a bunch of drivers to a vehicle
			personnel.put(vehicle, driverSet);
		}
		
		//Now we can query the map with a vehicle name and find the drivers
		System.out.println("\nDrivers for Volkswagen are "+personnel.get("Volkswagen"));
	}

}
