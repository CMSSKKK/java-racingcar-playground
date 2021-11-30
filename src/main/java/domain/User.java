package domain;

import utils.InputCheck;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private ArrayList<Car> cars;
    private int times;

    public User() {
        this.cars = new ArrayList<>();
    }

    public ArrayList<Car> getCarList() {
        return this.cars;
    }

    public void setRacingCar(String name) {
        this.cars.add(new Car(name));
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getTimes() {
        return this.times;
    }

    public void setRacingCars(String text) {
        String[] arr = InputCheck.split(text);

        for (String token : arr) {
            this.cars.add(new Car(token));
        }
    }
}
