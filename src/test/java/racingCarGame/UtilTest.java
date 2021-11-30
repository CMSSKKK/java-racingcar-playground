package racingCarGame;

import utils.InputCheck;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilTest {

    @Test
    @DisplayName("쉼표를 구분자로 문자열을 나눈다.")
    void split_with_comma_string() {
        String text = "pobi,crong,honux";
        String[] arr = InputCheck.split(text);
        assertThat(arr[0]).isEqualTo("pobi");
        assertThat(arr[1]).isEqualTo("crong");
        assertThat(arr[2]).isEqualTo("honux");
    }

    @Test
    @DisplayName("나눠진 토큰들은 5자를 초과할 수 없다.")
    void token_valid_check() {
        String token = "qwerty";
        assertThrows(IllegalArgumentException.class, ()-> InputCheck.validLength(token));
        assertThat(InputCheck.validLength("crong")).isTrue();
    }

    @Test
    @DisplayName("텍스트 내에 5자를 초과하는 토큰이 있을 경우 예외 처리")
    void tokens_valid_check() {
        String text = "qwerty,crong,honux";
        assertThrows(IllegalArgumentException.class, ()-> InputCheck.split(text));
    }

    @Test
    @DisplayName("list의 사이즈가 1초과하면 false, 1이면 true ")
    void list_size_check() {
        List<String> list = Arrays.asList("dfdf","dfsf");
        assertThat(InputCheck.isOne(list)).isFalse();
        assertThat(InputCheck.isOne(Arrays.asList("dfdf"))).isTrue();
    }

}
