package domain;

import java.util.Objects;
import java.util.Random;

public class Car {
    private static final int STOP = 3;
    private Name name;
    private Position position;

    public Car(String name) {
       this(name,0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    public int position() {
        return position.status();
    }

    public Position getPosition() {
        return this.position;
    }

    public void move(int randomNo) {
        if(randomNo > STOP) {
            position.plusPosition();
        }
    }

    public void moveRandom() {
        if(getRandomNo() > STOP) {
            position.plusPosition();
        }
    }

    public static int getRandomNo() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
