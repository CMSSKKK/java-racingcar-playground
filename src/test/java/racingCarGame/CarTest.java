package racingCarGame;

import domain.Car;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차는 이름을 가진다.")
    void car_has_name() {
        Car car = new Car("name");
        assertThat(car.getName()).isEqualTo("name");
    }

    @Test
    @DisplayName("자동차는 자신의 위치를 가진다.")
    void car_has_position() {
        Car car = new Car("name");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차는 한칸씩 움직일 수 있다.")
    void car_move_oneByOne() {
        Car car = new Car("name");
        assertThat(car.move()).isEqualTo(1);
    }

}
