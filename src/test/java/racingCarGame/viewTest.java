package racingCarGame;

import domain.Car;
import domain.Cars;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.Show;

import java.util.Arrays;
import java.util.List;

public class viewTest {

    @Test
    @DisplayName("자동차 위치 출력하기(자동차의 위치를 '-'로 표시함)")
    void print_car_position() {
        Car car = new Car("pobi");
        car.move(5);
        Assertions.assertThat(Show.printCarPosition(car)).isEqualTo("-");

    }

    @Test
    @DisplayName("레이싱 중 차 하나의 중간결과 출력하기(자동차의 위치를 '-'로 표시함)")
    void print_car_board_print() {
        Car car = new Car("pobi");
        car.move(5);
        car.move(5);
        car.move(5);
        Assertions.assertThat(Show.printRacingCarStatus(car)).isEqualTo("pobi : ---");

    }

    @Test
    @DisplayName("레이싱 중 중간결과 출력하기(자동차의 위치를 '-'로 표시함)")
    void print_cars_board_print() {
        List<Car> arr = Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"));
        Cars cars = new Cars(arr);
        Assertions.assertThat(Show.printRacingCarsBoard(cars)).isEqualTo("pobi : "+"\n"+"crong : "+"\n"+"honux : "+"\n");

    }

}
