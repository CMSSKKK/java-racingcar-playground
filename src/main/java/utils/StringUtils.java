package utils;

import java.util.Arrays;
import java.util.List;

public class StringUtils {

    public static List<String> split(String text) {
        List<String> names = Arrays.asList(text.split(","));
        return names;
    }
}
