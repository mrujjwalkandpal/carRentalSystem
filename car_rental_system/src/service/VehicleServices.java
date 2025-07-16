package service;

import java.util.List;
import java.util.Scanner;

import config.AppConstants;
import model.Vehicle;
import storage.VehicleStorage;

public class VehicleServices {
	
	Scanner sc = new Scanner(System.in);
	public void showAvailableVehicles() {
		List<Vehicle> availableVehicle = VehicleStorage.getAvailableVehicle();
		
		if(availableVehicle.isEmpty()) {
			System.out.println("Sorry, No Vehicles are Availble at this Point ");
			return;
		}
		
		System.out.println("_______________Available Vehicles________________");
		for(Vehicle vehicles:availableVehicle) {
			System.out.println(vehicles.getRegistrationNumber()+" -> " + vehicles.getModel());
		}
		
	}
	
	
	
	public void rentVehicle() {
		showAvailableVehicles();
		
		System.out.println("");
		System.out.println("Enter Registration Id to Find the Vehicle and Rent it : ");
		String regIdInput= sc.nextLine();
		
		Vehicle vehicleToSearch = VehicleStorage.getByRegId(regIdInput);
		if(vehicleToSearch==null) {
			System.out.println("Vehicle with this Registration Id doesn't exists");
			return;
		}
		if(!vehicleToSearch.getStatus()){
			System.out.println("Vehicle isn't Available at this Time");
			return;
		}
		
		String vehicleType= vehicleToSearch.getClass().getSimpleName();
		System.out.println("Enter Number of Hours to Rent the "+ vehicleType);
		double hours=sc.nextInt();
		sc.nextLine();
		
		
		if(hours<=0) {
			System.out.println("Invalid Input");
			return;
		}
				
		double rentalCost= vehicleToSearch.calculateRentalCost(hours);
		double taxedCost = rentalCost+(AppConstants.TAX_RATE*rentalCost);
		System.out.println("Rental Cost: ₹"+rentalCost);
		System.out.println("Taxes: "+AppConstants.TAX_RATE+"%");
		System.out.println("Total Cost: ₹"+taxedCost);
		System.out.println("");
		System.out.println("Do you want to Rent the "+vehicleType+ "? (yes/no) ");
		
		String userChoiceToRent= sc.next().toLowerCase();
		
		if(userChoiceToRent.equals("yes")) {
			vehicleToSearch.setStatus(false);
			System.out.println("Vehicle Successfully Rented");
		}
		
		else if( userChoiceToRent.equals("no")) {
			return;
		}
		else {
			System.out.println("Sorry Wrong input !");
		}
		
		
	}
}
