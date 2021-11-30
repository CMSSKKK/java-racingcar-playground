package view;

import domain.Car;
import domain.Cars;

import java.util.List;

public class Show {

    private static final String SYMBOL = "-";

    public static String printRacingCarStatus(Car car) {
        return String.format("%s : %s",car.getName(),printCarPosition(car));
    }

    public static String printCarPosition(Car car) {
        String position = "";
        for (int i = 0; i <car.getPosition(); i++) {
            position += SYMBOL;
        }

        return position;
    }


    public static String printRacingCarsBoard(Cars cars) {
        List<Car> carArr = cars.getCars();
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : carArr) {
            stringBuilder.append(Show.printRacingCarStatus(car)).append('\n');
        }
        return stringBuilder.toString();
    }
}
