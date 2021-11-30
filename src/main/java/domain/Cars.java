package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void move() {
        for (Car car : cars) {
            car.moveRandom();
        }
    }

    public List<String> findWinner() {
        List<String> winnerList = new ArrayList<>();
        int maxNumber = cars.stream().map(Car::getPosition).max(Integer::compareTo).get();
        cars.stream().filter(car -> car.getPosition() == maxNumber).forEach(car -> winnerList.add(car.getName()));
        return winnerList;
    }
}
