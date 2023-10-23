package com.metlushko.util;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }
        try {
            int number = Integer.parseInt(str);
            return number % 2 == 0;
        } catch(NumberFormatException e) {
            return false;
        }
    }


}
