package com.xf.docman.front.utils;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 */
public class AppAssert {

    public static void notBlank(String value, String msg) {
        if (value == null || value.length() < 1) {
            throw new RuntimeException(msg);
        }
    }

    public static void notBlank(Long value, String msg) {
        if (value == null) {
            throw new RuntimeException(msg);
        }
    }

    public static void notBlank(Integer value, String msg) {
        if (value == null) {
            throw new RuntimeException(msg);
        }
    }

    public static void notBlank(Double value, String msg) {
        if (value == null) {
            throw new RuntimeException(msg);
        }
    }

    public static void notBlank(BigDecimal value, String msg) {
        if (value == null) {
            throw new RuntimeException(msg);
        }
    }

    public static void notBlank(Date value, String msg) {
        if (value == null) {
            throw new RuntimeException(msg);
        }
    }

    public static void notBlank(Object value, String msg) {
        if (value == null) {
            throw new RuntimeException(msg);
        }
    }
}
