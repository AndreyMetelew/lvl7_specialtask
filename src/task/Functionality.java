package task;

import java.util.ArrayList;
import java.util.Scanner;

/* 2. Нужно добавить в программу новую функциональность.

Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я */

public class Functionality {

    ArrayList<String> list = new ArrayList<>();

    Functionality () {

        System.out.println();
        System.out.println("""
                Задание №2 повышенной сложности:
                Ввести с клавиатуры строки, пока не будет введена пустая строка.
                Строки будут конвертированы в верхний регистр и выведены на экран.""");
        System.out.println();

        System.out.println("Введите строки в список. Если вы введете пустую строку - ввод прекратится.");
        for (int i = 0; true; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку №" + (i + 1) + ": ");
            String cache = scanner.nextLine();
            if (cache.equals("")) {
                System.out.println("Хорошо, ввод прекращён.");
                break;
            }
            list.add(cache);
        }
        System.out.println();

        System.out.println("Изменяем строки...");
        for (int i = 0; i < list.size(); i++) {
            String cache = list.get(i);
            list.add(i, cache.toUpperCase());
            list.remove(i + 1);
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Строка №" + (i + 1) + ": " + list.get(i));
        }
    }

    public static class newFunctionality {

        ArrayList<String> list = new ArrayList<>();

        newFunctionality () {

            System.out.println();
            System.out.println("""
                    Задание №2 повышенной сложности:
                    Ввести с клавиатуры строки, пока не будет введена пустая строка.
                    Список будет перестроен: строки с четным кол-вом символов удвоятся, с нечетным - утроятся.
                    Потом список будет выведен""");
            System.out.println();

            for (int i = 0; true; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите строку №" + (i + 1) + ": ");
                String cache = scanner.nextLine();
                if (cache.equals("")) {
                    System.out.println("Хорошо, ввод прекращён.");
                    break;
                }
                list.add(cache);
            }
            System.out.println();

            System.out.println("Изменяем строки...");
            for (int i = 0; i < list.size(); i++) {
                String cache = list.get(i);
                if (list.get(i).length() % 2 == 0) {
                    list.add(i, cache + " " + cache);
                    list.remove(i + 1);
                }
                else {
                    list.add(i, cache + " " + cache + " " + cache);
                    list.remove(i + 1);
                }
            }
            System.out.println();

            for (int i = 0; i < list.size(); i++) {
                System.out.println("Строка №" + (i + 1) + ": " + list.get(i));
            }
            System.out.println();

        }
    }

}