package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> intList = new FixedList<>(3);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        for (Integer num : intList.getItems()) {
            System.out.println(num);
        }

        FixedList<LocalDate> dateList = new  FixedList<>(2);
        dateList.add(LocalDate.now());
        dateList.add(LocalDate.now());
        dateList.add(LocalDate.now());
        dateList.add(LocalDate.now());
//        dates.add(15); // line fails since it doesn't match specified type

        for (LocalDate date : dateList.getItems()) {
            System.out.println(date);
        }

        FixedList<String> stringList = new FixedList<>(3);
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        for (String str : stringList.getItems()) {
            System.out.println(str);
        }
    }
}
