package task;

import java.util.ArrayList;
import java.util.Scanner;

/* 2. Переставить M первых строк в конец списка

Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки. */

public class MAndN {

    ArrayList<String> list = new ArrayList<>();
    int n, m;

    MAndN () {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("""
                Задание №2:
                Ввести с клавиатуры числа N и M,
                где N - кол-во строк в списке,
                а M - это количество раз, когда надо переставить первые строки в конец списка.
                После надо вывести содержимое список строк с новой строки.""");
        System.out.println();

        System.out.print("Введите кол-во вводимых в список строк N: ");
        n = scan.nextInt();
        System.out.print("Введите кол-во раз, равное M, отвечающее за перенос первой строки в конец списка: ");
        m = scan.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку №" + (i + 1) + ": ");
            String cache = scan.nextLine();
            list.add(cache);
        }
        System.out.println();

        System.out.println("Перетаскиваем строки из начала в конец...");
        for (int i = 0; i < m; i++) {
            String cache = list.get(0);
            list.remove(0);
            list.add(list.size() - 1, cache);
        }
        System.out.println();

        System.out.println("Новый список строк:");
        for (int i = 0; i < list.size(); i++)
            System.out.println("Строка №" + (i + 1) + ": " + list.get(i));

    }

}