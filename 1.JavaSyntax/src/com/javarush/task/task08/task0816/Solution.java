package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("05 1 2012"));
        map.put("Ирина", dateFormat.parse("07 10 2005"));
        map.put("Алина", dateFormat.parse("09 20 2001"));
        map.put("Ольга", dateFormat.parse("01 10 2001"));
        map.put("Полина", dateFormat.parse("02 10 2001"));
        map.put("Олег", dateFormat.parse("05 10 2001"));
        map.put("Никита", dateFormat.parse("03 10 2001"));
        map.put("Вася", dateFormat.parse("10 10 2001"));
        map.put("Петя", dateFormat.parse("06 10 2001"));
        map.put("Наталья", dateFormat.parse("12 10 2001"));

        return map;


    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        HashMap<String, Date> copy = new HashMap<>(map);

        for (Map.Entry<String, Date> s : copy.entrySet()) {

            Calendar calendar = new GregorianCalendar();
            calendar.setTime(s.getValue());
            if (calendar.get(Calendar.MONTH) == Calendar.JUNE)
                map.remove(s.getKey());
            if (calendar.get(Calendar.MONTH) == Calendar.JULY)
                map.remove(s.getKey());
            if (calendar.get(Calendar.MONTH) == Calendar.AUGUST)
                map.remove(s.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
