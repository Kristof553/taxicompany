package taxicompany.car;

import taxicompany.driver.Driver;

public class Electrice extends CarWithDriver{

    public static final int COST = 400;


    public Electrice(int uniqueID, int amountOfPassengerPerWeek, Driver driver) {
        super(uniqueID, amountOfPassengerPerWeek, driver, COST);

    }

    @Override
    public int calculateAmountOfPassengerPerWeek(int amountOfPassengerPerWeek, Driver driver) {
        return driver.getExperience().getPlusAmountOfPassenger() + amountOfPassengerPerWeek;
    }


}
