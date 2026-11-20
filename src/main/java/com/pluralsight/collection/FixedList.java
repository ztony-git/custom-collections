package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T> {
    List<T> list;
    int maxSize;

    public FixedList(int maxSize) {
        if  (maxSize <= 0) {
            return;
        }

        this.maxSize = maxSize;
        list = new ArrayList<T>();
    }

    public void add(T element) {
        if (list.size() >= maxSize) {
            System.out.println("List is full!");
            return;
        }

        list.add(element);
    }

    public List<T> getItems() {
        return list;
    }
}
