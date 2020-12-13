package com.example.MyCareerDB;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        LocalDate localDate = LocalDate.parse(s);
        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        System.out.println(localDate);
    }
}
