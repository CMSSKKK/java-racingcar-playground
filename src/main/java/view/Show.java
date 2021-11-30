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


    public static void printRacingCarsBoard(Cars cars) {
        List<Car> carArr = cars.getCars();
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : carArr) {
            stringBuilder.append(printRacingCarStatus(car)).append('\n');
        }
        System.out.println(stringBuilder.toString());
    }

    public static void printStart() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printHowManyTimes() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void printResult(Cars cars) {
        printRacingCarsBoard(cars);
        printWinner(cars.findWinner());

    }

    public static void printWinner(List<String> names) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = names.size();
        if(names.size() > 1) {
            for (int i = 0; i < size-1; i++) {
                stringBuilder.append(names.get(i)).append(", ");
            }
        }
        stringBuilder.append(names.get(size-1));
        stringBuilder.append("가 최종 우승했습니다.");
        System.out.println(stringBuilder.toString());
    }
}
