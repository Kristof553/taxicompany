package taxicompany.car;

public abstract class Car {

    private int uniqueID;

    private int amountOfPassengerPerWeek;



    private int cost;

    public Car(int uniqueID, int amountOfPassengerPerWeek, int cost) {
        this.uniqueID = uniqueID;
        this.amountOfPassengerPerWeek = amountOfPassengerPerWeek;
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public int getAmountOfPassengerPerWeek() {
        return amountOfPassengerPerWeek;
    }


}
