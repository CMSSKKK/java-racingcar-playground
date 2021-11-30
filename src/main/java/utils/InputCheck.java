package utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class InputCheck {

    public static String[] split(String text) {
        if(!text.contains(",")) {
            throw new IllegalArgumentException();
        }
        String[] arr = text.split(",");
        Arrays.stream(arr).forEach(s ->validLength(s));
        return arr;
    }

    public static boolean validLength(String token) {
        if(token.length() > 5) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
