package taxicompany.car;

import taxicompany.driver.Driver;
import taxicompany.driver.Experience;

public class Gasoline extends CarWithDriver{

    public static final int COST = 300;

    public static final int MAINTENCE = 20;

    public Gasoline(int uniqueID, int amountOfPassengerPerWeek, Driver driver) {
        super(uniqueID, amountOfPassengerPerWeek, driver, COST);
    }


    @Override
    public int calculateAmountOfPassengerPerWeek(int amountOfPassengerPerWeek, Driver driver) {
        return driver.getExperience().getPlusAmountOfPassenger() + amountOfPassengerPerWeek;
    }


    public int calculateMaintence(int month){
        return MAINTENCE * month;
    }


}
