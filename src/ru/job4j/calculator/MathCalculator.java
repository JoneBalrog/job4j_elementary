package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return subtraction(first, second) + dividing(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + subtraction(first, second) + multiply(first, second) + dividing(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 равен: " + subAndDiv(10, 20));
        System.out.println("Результат расчета 3 равен: " + sumAll(10, 20));
    }
}