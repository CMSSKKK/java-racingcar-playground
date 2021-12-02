package domaintest;

import domain.Car;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void create() {
        Car pobi = new Car("pobi",0);
        assertThat(pobi).isEqualTo(new Car("pobi"));
    }

    @Test
    @DisplayName("자동차의 포지션을 확인하는 기능 체크")
    void car_포지션_체크() {
        Car pobi = new Car("pobi",0);
        Car crong = new Car("crong",2);
        assertThat(pobi.intPosition()).isEqualTo(0);
        assertThat(crong.intPosition()).isEqualTo(2);
    }

    @Test
    @DisplayName("자동차 move()시 위치가 한 칸씩 이동한다.")
    void car_move() {
        Car pobi = new Car("pobi",0);
        Car crong = new Car("crong",2);
        pobi.move(5);
        crong.move(5);
        assertThat(pobi.intPosition()).isEqualTo(1);
        assertThat(crong.intPosition()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차는 랜덤 숫자 중 3이하의 수에는 움직이지 않고, 4이상의 수에는 움직인다.")
    void car_moveR() {
        Car pobi = new Car("pobi",0);
        Car crong = new Car("crong",2);
        pobi.move(3);
        crong.move(4);
        assertThat(pobi.intPosition()).isEqualTo(0);
        assertThat(crong.intPosition()).isEqualTo(3);
    }
}
