package com.example.odd_even;

public class App {


    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = 7;

        System.out.println(number + " is " + checkOddEven(number));
    }
}


