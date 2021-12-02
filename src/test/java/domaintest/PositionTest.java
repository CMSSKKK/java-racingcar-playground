package domaintest;

import domain.Position;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @Test
    void create() {
        Position position = new Position(5);
        assertThat(position).isEqualTo(new Position(5));
    }

    @Test
    @DisplayName("Position 조회하기")
    void position_status() {
        Position position = new Position(5);
        assertThat(position.intPosition()).isEqualTo(5);
    }

    @Test
    @DisplayName("Position을 1씩 증가시킨다.")
    void plusPosition() {
        Position position = new Position(5);
        position.plusPosition();
        assertThat(position.intPosition()).isEqualTo(6);
    }
}
