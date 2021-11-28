package part1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    private static final int ZERO = 0;
    private static final String BASIC_REGEX = "(,)|(:)";
    private static final String CUSTOM_REGEX = "//(.)\n(.*)";
    private static Matcher matcher;


    public static int splitAndSum(String input) {

        if (isNullOrEmpty(input)) return ZERO;

        if (isBasicPattern(input)) {
            return arraySum(input.split(BASIC_REGEX));
        }

        if (isCustomPattern(input)) {
            String customDelimiter = matcher.group(1);
            String[] tokens = matcher.group(2).split(customDelimiter);
            return arraySum(tokens);
        }

        return stringToInt(input);
    }

    private static int stringToInt(String token) {
        if (token.matches("(\\D+)")) {
            throw new RuntimeException();
        }
        int value = Integer.parseInt(token);
        if (value < ZERO) {
            throw new RuntimeException();
        }
        return value;
    }

    private static boolean isNullOrEmpty(String text) {
        return text == null || text.isEmpty();
    }

    private static boolean isBasicPattern(String text) {
        matcher = Pattern.compile(BASIC_REGEX).matcher(text);
        return matcher.find();
    }

    private static boolean isCustomPattern(String text) {
        matcher = Pattern.compile(CUSTOM_REGEX).matcher(text);
        return matcher.find();
    }

    private static int arraySum(String[] tokens) {
        return Arrays.stream(tokens).mapToInt(StringAddCalculator::stringToInt).sum();
    }

}
