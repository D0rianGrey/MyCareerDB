package com.example.Calculator;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Calculator {
    static Logger log = Logger.getLogger(Calculator.class);
    static Scanner scanner;
    static Scanner scanner2;


    public static void main(String[] args) {


        while (true) {
            log.info("Start of calculation");
            scanner = new Scanner(System.in);
            scanner2 = new Scanner(System.in);

            System.out.println("Enter your first number: ");
            double firstLine = scanner.nextDouble();


            System.out.println("Enter what operation do you want to do ");
            String secondLine = scanner2.nextLine();


            System.out.println("Enter your second number: ");
            double thirdLine = scanner.nextDouble();
            double result;

            if (thirdLine == 0) {
                throw new ArithmeticException("You cannot divide by 0");
            } else {
                switch (secondLine) {
                    case "+" -> {
                        result = firstLine + thirdLine;
                        System.out.println(result);
                    }
                    case "-" -> {
                        result = firstLine - thirdLine;
                        System.out.println(result);
                    }
                    case "/" -> {
                        result = firstLine / thirdLine;
                        System.out.println(result);
                    }
                    case "*" -> {
                        result = firstLine * thirdLine;
                        System.out.println(result);
                    }
                }

                log.info("End of calculation");
            }

        }

    }


}
