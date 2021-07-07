package ru.job4j.calculator;

public class Calculator {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        Calculator.hello(name, age);
    }
}