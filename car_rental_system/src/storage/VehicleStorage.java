package storage;
import java.util.ArrayList;
import java.util.List;
import model.Vehicle;

public class VehicleStorage {
	private static List<Vehicle> vehicleList = new ArrayList<>();
	
	public static void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	public static List<Vehicle> getAllVehicle(){
		return vehicleList;
	}
	
	public static List<Vehicle> getAvailableVehicle(){
		List<Vehicle> availableVehicleList = new ArrayList<>();
		for(Vehicle vehicle: vehicleList) {
			if(vehicle.isAvailable()) {
				availableVehicleList.add(vehicle);
			}
		}
		return availableVehicleList;
	}
	
	public static Vehicle getByRegId(String regId) {
		for(Vehicle vehicle: vehicleList) {
			String regIdReturn=vehicle.getRegistrationNumber();
			if(regIdReturn.equalsIgnoreCase(regId)) {
				return vehicle;
			}
		}
		return null;
	}
	
	public static boolean removeVehicle(String regId) {
		Vehicle toRemove= getByRegId(regId) ;
		if(toRemove!=null) {
			vehicleList.remove(toRemove);
			return true;
		}
		return false;
	}
		
}
