package domain;

import utils.InputCheck;
import view.Show;

import java.util.Scanner;

public class RacingGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static final User user = new User();;

    private Cars cars;

    public void start() {
        Show.printStart();
        user.setRacingCars(scanner.next());
        this.cars = new Cars(user.getCarList());
        Show.printHowManyTimes();
        user.setTimes(scanner.nextInt());
    }

    public void racing() {
        for (int i = 0; i < this.user.getTimes() ; i++) {
            cars.move();
            Show.printRacingCarsBoard(cars);
        }
        Show.printResult(cars);
    }


}
