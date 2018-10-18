package ru.hack;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class DateAndTime {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        DateFormatSymbols dfs = new DateFormatSymbols();
        //System.out.println(calendar.getTime().toString());
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        //System.out.println("day is " + weekday);
        return dfs.getWeekdays()[weekday].toUpperCase();

    }
}
