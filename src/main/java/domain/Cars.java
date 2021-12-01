package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public List<Car> findWinner() {
        List<Car> winners = new ArrayList<>();

        for (Car car : this.cars) {
             if(car.getPosition().equals(getMaxPosition(this.cars))) {
                 winners.add(car);
            }

        }
        return winners;
    }

    private static Position getMaxPosition(List<Car> cars) {
        Position maxPosition = new Position();
        for (Car car : cars) {
            if(car.position() > maxPosition.status() ) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }


}
