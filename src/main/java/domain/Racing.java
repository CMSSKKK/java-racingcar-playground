package domain;

import View.InputView;
import View.ResultView;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Racing {
    private Cars racingCars;
    private int tryCount;


    private Racing(String names, int tryCount) {
        this.racingCars = setCars(names);
        this.tryCount = tryCount;
    }

    public static Racing getInstance() {
        Scanner scanner = new Scanner(System.in);
        InputView.orderNames();
        String names = scanner.nextLine();
        InputView.orderTryCount();
        int tryCount = scanner.nextInt();
        Racing racing = new Racing(names, tryCount);
        return racing;
    }

    public void play() {
        ResultView.printResultCommand();
        for (int i = 0; i < this.tryCount; i++) {
            this.racingCars.move();
            ResultView.racingResult(this.racingCars);
        }
    }

    public void printResult() {
        ResultView.racingResult(this.racingCars);
        ResultView.winnersPresent(this.racingCars);
    }

    private Cars setCars(String names) {
        List<String> carNames = StringUtils.split(names);
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return new Cars(cars);
    }


}
