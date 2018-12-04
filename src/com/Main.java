package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(4);

        Collections.sort(list);

        int index = Collections.binarySearch(list, 5);
        System.out.println(index);
        System.out.println(list.get(index));

    }
}




























