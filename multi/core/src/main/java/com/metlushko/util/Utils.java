package com.metlushko.util;

public class Utils {
   public static boolean isAllPositiveNumber(String... str) {
        for (String s : str) {
            if (!StringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
