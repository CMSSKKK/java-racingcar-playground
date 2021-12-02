package UtilsTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.StringUtils;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

    @Test
    @DisplayName("이름 문자열을 콤마로 구분하여 StringList로 반환한다.")
    void splitTest() {
        String text = "pobi,crong,honux";
        List<String> names = StringUtils.split(text);
        assertThat(names).isEqualTo(Arrays.asList("pobi","crong","honux"));
    }
}
