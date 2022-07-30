package taxicompany.driver;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.time.chrono.JapaneseEra.values;

public class Driver {

    private int mobileNumber;

    private String name;

    private int age;

    private int salary;

    private static List<Integer> PHONE_NUMBERS;

    private Experience experience;

    public Driver(int mobileNumber, String name, int age, int salary, Experience experience) {
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }


    public Experience getExperience() {
        return experience;
    }


}
