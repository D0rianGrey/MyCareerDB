package com.example.MyCareerDB;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Eugene");
        list1.add("Anton");
        list1.add("Julia");

        List<Integer> list2 = list1.stream().map(String::length).collect(Collectors.toList());

        System.out.println(list2);

    }
}
