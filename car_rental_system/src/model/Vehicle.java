package model;

import config.AppConstants;

public abstract class Vehicle {
    
    private String registrationNumber;
    private String model;
    private int age;

    private boolean haveInsurance;
    private boolean havePapers;
    private boolean haveDamages;
    private boolean isAvailable;
    private boolean status;

    public Vehicle(String registrationNumber, String model, int age,
                   boolean haveInsurance, boolean havePapers, boolean haveDamages, boolean status) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.age = age;

        this.haveInsurance = haveInsurance;
        this.havePapers = havePapers;
        this.haveDamages = haveDamages;
        this.status=status;
        this.isAvailable = age <= AppConstants.MAX_AGE_OF_VEHICLE;
    }

    public abstract double calculateRentalCost(double hours);

    // ---------- Getters and Setters ----------

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasInsurance() {
        return haveInsurance;
    }

    public void setHaveInsurance(boolean haveInsurance) {
        this.haveInsurance = haveInsurance;
    }

    public boolean hasPapers() {
        return havePapers;
    }

    public void setHavePapers(boolean havePapers) {
        this.havePapers = havePapers;
    }

    public boolean hasDamages() {
        return haveDamages;
    }

    public void setHaveDamages(boolean haveDamages) {
        this.haveDamages = haveDamages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
