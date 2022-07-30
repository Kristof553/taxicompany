package taxicompany;

import taxicompany.car.*;
import taxicompany.driver.Driver;
import taxicompany.driver.Experience;

import java.util.List;
import java.util.Random;

public class TaxiCompany {

    private List<Car> cars;

    private List<Driver> drivers;

    private int bank;

    public static int WEEKS = 52;

    public boolean canBuyNewCar(){
        int totalCost = 0;
        for (Car car:cars){
            totalCost += car.getCost();
        }
        if (bank > totalCost){
            return true;
        }
        return false;
    }

    public int getRandomNumberForChance() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public void addNewCarToCompany(){
        if (canBuyNewCar()){
            if (getRandomNumberForChance() == 1){
                Driver driver = new Driver(123, "droo", 45, 23, Experience.setExperienceByRandom() );
                Electrice electriceCar = new Electrice(12, 45, driver);
                cars.add(electriceCar);
            }else if (getRandomNumberForChance() == 2){
                Driver driver = new Driver(123, "droo", 45, 23, Experience.setExperienceByRandom() );
                Gasoline gasolineCar = new Gasoline(12, 23, driver);
                cars.add(gasolineCar);
            }
            else {
                SelfDriving selfDriving = new SelfDriving(12, 45);
                selfDriving.reducedWeek();
                cars.add(selfDriving);
            }
        }
    }

    public int calculatePassengersPerYear(){
        int totalPassenger = 0;
        for (Car car: cars){
            if (car instanceof CarWithDriver){
                Driver driver = new Driver(12, "droo", 34, 56, Experience.setExperienceByRandom());
                totalPassenger += ((CarWithDriver) car).calculateAmountOfPassengerPerWeek(23,driver);
            }
            else {
                totalPassenger += car.getAmountOfPassengerPerWeek();
            }
        }
        return totalPassenger;
    }
}
