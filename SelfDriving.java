package taxicompany.car;

public class SelfDriving extends Car{

    public static final int COST = 750;

    private int weeksWhenWorked;

    public SelfDriving(int uniqueID, int amountOfPassengerPerWeek) {
        super(uniqueID, amountOfPassengerPerWeek, COST);

    }

    public void reducedWeek(){
        weeksWhenWorked --;
    }


}
