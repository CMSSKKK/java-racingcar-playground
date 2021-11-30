package racingCarGame;

import domain.Car;
import domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class UserTest {

    @Test
    @DisplayName("유저가 자동차의 이름을 정한다.")
    void user_choose_carName() {
        User user = new User();
        user.setRacingCar("pobi");
        ArrayList<Car> carList = user.getCarList();
        Assertions.assertThat(carList.get(0).getName()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("자동차의 이름은 5글자까지만 가능하다.")
    void user_choose_carName_5글자이하() {
        User user = new User();
        user.setRacingCar("pobi");
        ArrayList<Car> carList = user.getCarList();
        Assertions.assertThat(carList.get(0).getName()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("유저가 시도할 횟수를 정한다.")
    void user_choose_시도할_횟수() {
        User user = new User();
        user.setRacingCar("pobi");
        user.setTimes(5);
        Assertions.assertThat(user.getTimes()).isEqualTo(5);

    }
}
