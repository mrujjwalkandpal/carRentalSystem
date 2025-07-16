package model;

import config.AppConstants;

public class Bike extends Vehicle {
	
	public Bike(String registrationNumber, String model, int age, boolean haveInsurance,boolean status, boolean havePapers, boolean haveDamages) {
		super(registrationNumber,model,age,haveInsurance,havePapers,haveDamages,status);
	}
	
	@Override
	public double calculateRentalCost(double hours) {
		return (AppConstants.BIKE_COST_PER_HOUR * hours) + AppConstants.BASE_RENTAL_FEE;
	}
}
