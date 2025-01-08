package controller;

import java.util.regex.Pattern;

public class Validator {
    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z ]{3,30}$");
    private static final Pattern PRICE_PATTERN = Pattern.compile("^\\d+(\\.\\d{1,2})?$");

    public static boolean isValidName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

    public static boolean isValidPrice(String price) {
        return PRICE_PATTERN.matcher(price).matches();
    }
}
