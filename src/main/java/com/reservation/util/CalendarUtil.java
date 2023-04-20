package com.reservation.util;


import com.reservation.constant.Month;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Year;

public class CalendarUtil {

    public static LocalDate[] getDaysOfMonth(Month month, int year) {
        int numDays = month.length(Year.isLeap(year));
        LocalDate[] daysOfMonth = new LocalDate[numDays];
        for (int i = 0; i < numDays; i++) {
            daysOfMonth[i] = LocalDate.of(year, month.getValue(), i + 1);
        }
        return daysOfMonth;
    }
}
