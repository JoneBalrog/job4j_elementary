package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) { // сравниваем переменную name с "super mario"
            System.out.println("Start - super mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("super mario");
        Game.menu("tanks");
        Game.menu("tetris");
    }
}
