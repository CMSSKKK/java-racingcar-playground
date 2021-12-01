package domaintest;

import domain.Name;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameTest {

    @Test
    @DisplayName("name 객체 생성")
    void create() {
        Name name = new Name("pobi");
        assertThat(name).isEqualTo(new Name("pobi"));
    }

    @Test
    @DisplayName("name은 5자를 초과할 수 없다.")
    void name_limit_5() {
        assertThat(Name.validCheck("pobi")).isTrue();
        assertThrows(IllegalArgumentException.class, ()->Name.validCheck("qwerty"));
    }

    @Test
    @DisplayName("name은 공백과 null은 불가하다")
    void name_null_blank() {
        assertThrows(IllegalArgumentException.class, ()->Name.validCheck(""));
        assertThrows(IllegalArgumentException.class, ()->Name.validCheck(null));
    }

    @Test
    @DisplayName("name 생성자 테스트 6자")
    void name_limit_5_생성자_실패() {
        assertThrows(IllegalArgumentException.class, ()->new Name("qwerty"));
    }

    @Test
    @DisplayName("name 생성자 테스트 5자")
    void name_limit_5_생성자_성공() {
        Name pobis = new Name("pobis");
        assertThat(pobis).isEqualTo(new Name("pobis"));
    }


}
