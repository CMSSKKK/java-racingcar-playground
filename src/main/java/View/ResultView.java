package View;

import domain.Car;
import domain.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    private static final String SIGN = "-";

    public static void playResult() {
        System.out.println(Constant.PlAY_RESULT);
    }

    public static void racingResult(Cars cars) {
        StringBuilder stringBuilder = new StringBuilder();

        List<Car> racingCars = cars.getCars();
        for (Car racingCar : racingCars) {
            String tempName = racingCar.stringName();
            String tempPosition = positionSign(racingCar.intPosition());
            stringBuilder.append(tempName).append(" : ").append(tempPosition).append('\n');
        }
        System.out.println(stringBuilder.toString());
    }

    public static void winnersPresent(Cars cars) {
        System.out.println(winnerResult(cars) + Constant.WINNER_RESULT);
    }

    public static void printResultCommand() {
        System.out.println(Constant.PlAY_RESULT);
    }

    private static String positionSign(int position) {
        String sign = "";
        for (int i = 0; i < position; i++) {
            sign += SIGN;
        }
        return sign;
    }

    private static String winnerResult(Cars cars) {
        List<Car> winners = cars.findWinner();
        List<String> winnersNames = winners.stream().map(Car::stringName).collect(Collectors.toList());
        String names = String.join(",", winnersNames);

        return names;

    }


}
