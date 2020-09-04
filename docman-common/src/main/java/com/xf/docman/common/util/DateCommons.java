package com.xf.docman.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class DateCommons {

    private static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
    };

    private static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal_1 = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static String date2String(Date date) {
        if (date == null) {
            return "";
        }
        return dateFormatThreadLocal_1.get().format(date);
    }

    public static String millis2StringWithMillis(long millis) {
        Date date = new Date(millis);
        return dateFormatThreadLocal.get().format(date);
    }

}
