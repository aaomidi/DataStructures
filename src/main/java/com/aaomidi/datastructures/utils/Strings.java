package com.aaomidi.datastructures.utils;

public class Strings {
    public static void log(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static void logn(String format, Object... args) {
        log(format + "%n", args);
    }
}
