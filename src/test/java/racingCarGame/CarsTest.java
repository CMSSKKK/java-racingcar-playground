package racingCarGame;

import domain.Car;
import domain.Cars;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.Show;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsTest {

    @Test
    @DisplayName("사용자가 이름을 정한 차들이 모여있는 객체")
    void cars_생성자_테스트() {

        List<Car> arr = Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"));
        Cars cars = new Cars(arr);
        Assertions.assertThat(cars.getCars()).isEqualTo(arr);
    }

    @Test
    @DisplayName("랜덤값에따라서 각 car의 move 처리하기")
    void cars_move() {
        List<Car> arr = Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"));
        Cars cars = new Cars(arr);
        for (int i = 0; i < 5; i++) {
            cars.move();
            Show.printRacingCarsBoard(cars);
        }


    }

    @Test
    @DisplayName("자동차의 위치가 가장 큰 자동차 찾기")
    void cars_find_winner() {
        List<Car> arr = Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"));
        Cars cars = new Cars(arr);
        for (int i = 0; i < 5; i++) {
            cars.move();
            Show.printRacingCarsBoard(cars);
        }
        List<String> winner = cars.findWinner();


    }


}
