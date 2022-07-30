package taxicompany.driver;

import java.util.Random;

public enum Experience {

    BEGINNER(15),
    ADVANCED(25),
    PROFESSION(40);

    public int getPlusAmountOfPassenger() {
        return PlusAmountOfPassenger;
    }

    private int PlusAmountOfPassenger;

    Experience(int PlusAmountOfPassenger) {
        this.PlusAmountOfPassenger = PlusAmountOfPassenger;
    }

    public static Experience setExperienceByRandom(){
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if (randomNum == 1){
            return Experience.BEGINNER;
        } else if (randomNum == 2) {
            return Experience.PROFESSION;
        }else {
            return Experience.ADVANCED;
        }

    }


}
