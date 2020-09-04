package com.xf.docman.front.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 */
public class DateTimeUtils {

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


    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
    private static final DateTimeFormatter dateTimeFormatterHms = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

    public static String date2String(DateTime dateTime) {
        return dateTimeFormatter.print(dateTime);

    }

    public static String date2StringHms(DateTime dateTime) {
        return dateTimeFormatterHms.print(dateTime);

    }

    public static DateTime firstDayOfWeek(DateTime value) {
        return value.dayOfWeek().withMinimumValue();
    }

    public static DateTime lastDayOfWeek(DateTime value) {
        return value.dayOfWeek().withMaximumValue();
    }




    public static DateTime firstDayOfMonth(DateTime value) {
        return value.dayOfMonth().withMinimumValue();
    }


    public static Date setHourDate(Date date,int hour) throws ParseException {
        if (date == null) return null;
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(Calendar.HOUR, hour);
        return ca.getTime();
    }
}
