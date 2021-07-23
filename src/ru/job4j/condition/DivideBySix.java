package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число делится на 3, но НЕ является четным.";
            }
        } else {
            if (number % 2 == 0) {
                rsl = "Исходное число НЕ делится на 3, но является четным.";
            } else {
                rsl = "Исходное число НЕ делится на 3 и НЕ является четным.";
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(6));
    }
}
