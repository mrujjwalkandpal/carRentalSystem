package config;

public class AppConstants {

    // =================== PRICING ===================
    public static final double BIKE_COST_PER_HOUR = 20.00;
    public static final double CAR_COST_PER_HOUR = 40.00;
    public static final double ELECTRIC_COST_PER_HOUR = 45.00;
    public static final double BASE_RENTAL_FEE = 100.00;
    public static final double TAX_RATE = 0.18;

    // =================== RENTAL POLICY ===================
    public static final int MAX_RENTAL_HOURS = 48;
    public static final int MIN_RENTAL_HOURS = 1;
    public static final int MAX_AGE_OF_VEHICLE = 10;

    // =================== FINE AND PENALTY ===================
    public static final double FINE_PER_DAY_IF_NOT_RETURNED = 500;
    public static final double BASE_FINE_FOR_DAMAGES = 300;
    public static final double BODY_DAMAGE_FINE = 1000;
    public static final double MAJOR_ACCIDENT_FINE = 2500;
    public static final double LATE_RETURN_PENALTY_RATE = 1.25;

    // =================== NOTIFICATIONS ===================
    public static final int DAYS_TO_WAIT_BEFORE_SENDING_NOTICE = 5;
    public static final int REMINDER_TO_SEND_BEFORE_RETURN_HOURS = 2;

    // =================== SYSTEM LIMITS ===================
    public static final int MAX_VEHICLES_ALLOWED = 100;

}
