package taxicompany.car;

import taxicompany.driver.Driver;

public abstract class CarWithDriver extends Car{


    private Driver driver;

    public CarWithDriver(int uniqueID, int amountOfPassengerPerWeek, Driver driver, int cost) {
        super(uniqueID, amountOfPassengerPerWeek, cost);
        this.driver = driver;
    }

    public abstract int calculateAmountOfPassengerPerWeek(int amountOfPassengerPerWeek, Driver driver);
}
