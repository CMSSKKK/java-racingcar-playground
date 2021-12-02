package domain;

import java.util.Objects;

public class Name {

    private static final int MAX_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validCheck(name);
        this.name = name.trim();

    }

    public String carName() {
        return this.name;
    }

    public static boolean validCheck(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("이름은 꼭 입력하셔야 합니다.");
        }

        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("이름은 5자를 넘을 수 없습니다.");
        }
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
