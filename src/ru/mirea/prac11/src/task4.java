package ru.mirea.prac11.src;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class task4 {
    public static void main(String[] args) {

        //with calendar
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DAY_OF_MONTH, 15);
        cal.set(Calendar.HOUR_OF_DAY, 12);
        cal.set(Calendar.MINUTE, 32);
        System.out.println(sdf.format(cal.getTime()));

        // with DATE
        Date date = new Date(102, 3, 15, 12, 32);
        System.out.println(sdf.format(date));
    }
}
