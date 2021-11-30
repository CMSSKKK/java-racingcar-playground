package domain;

import java.util.Random;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public static int random() {
        int number = new Random().nextInt(9)+1;
        return number;
    }

    public static boolean isMovable(int randomNumber) {
        return randomNumber>3;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public int move(int number) {
        if(isMovable(number)) {
            return this.position += 1;
        }
        return this.position;
    }

    public void moveReal(int number) {
        if(isMovable(number)) {
            this.position += 1;
        }

    }
    public void moveRandom() {
        moveReal(random());
    }


}
