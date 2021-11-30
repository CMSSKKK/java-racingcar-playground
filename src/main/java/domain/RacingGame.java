package domain;

import utils.InputCheck;
import view.Show;

import java.util.Scanner;

public class RacingGame {
    private static final Scanner scanner = new Scanner(System.in);
    private User user;
    private Cars cars;

    public void start() {
        Show.printStart();
        this.user = new User();
        user.setRacingCars(scanner.next());
        this.cars = new Cars(user.getCarList());
        Show.printHowManyTimes();
        this.user.setTimes(scanner.nextInt());
    }

    public void racing() {
        for (int i = 0; i < this.user.getTimes() ; i++) {
            cars.move();
            Show.printRacingCarsBoard(cars);
        }
        Show.printResult(cars);
    }


}
