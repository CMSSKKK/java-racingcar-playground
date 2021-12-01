package domaintest;

import domain.Car;
import domain.Cars;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CarsTest {

    @Test
    void creat() {
        List<Car> testCars = Arrays.asList(new Car("pobi"),new Car("crong"), new Car("honux"));
        Cars cars =new Cars(testCars);
        Assertions.assertThat(cars.getCars()).isEqualTo(testCars);
    }

    @Test
    @DisplayName("cars에서 우승자를 찾아서 새로운 리스트로 반환한다.")
    void findWinnerTest() {
        Car pobi = new Car("pobi",2);
        Car crong = new Car("crong",3);
        Car honux = new Car("honux",4);
        List<Car> testCars = Arrays.asList(pobi,crong,honux);
        Cars cars =new Cars(testCars);
        Assertions.assertThat(cars.findWinner()).containsExactly(honux);
    }

    @Test
    @DisplayName("cars에서 공동 우승자를 찾아서 새로운 리스트로 반환한다.")
    void findWinnerTest2() {
        Car pobi = new Car("pobi",2);
        Car crong = new Car("crong",4);
        Car honux = new Car("honux",4);
        List<Car> testCars = Arrays.asList(pobi,crong,honux);
        Cars cars =new Cars(testCars);
        Assertions.assertThat(cars.findWinner()).containsExactly(crong,honux);
    }
}
