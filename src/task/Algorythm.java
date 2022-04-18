package task;

/* 3. Задача по алгоритмам.

Задача: Программа вводит с клавиатуры 20 чисел и выводит их в убывающем порядке. */

import java.util.ArrayList;
import java.util.Scanner;

public class Algorythm {

    ArrayList<Integer> list = new ArrayList<>();

    Algorythm () {

        System.out.println();
        System.out.println("""
                Задание №3 повышенной сложности:
                Ввести с клавиатуры 20 чисел.
                Строки будут отсортированы и выведены на экран в убывающем порядке.""");
        System.out.println();

        System.out.println("Введите 20 чисел в список.");
        for (int i = 0; i < 20; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число №" + (i + 1) + ": ");
            int cache = scanner.nextInt();
            list.add(cache);
        }
        System.out.println();

        System.out.println("Производим сортировку по убыванию...");
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int cache = list.get(j);
                    list.remove(j);
                    list.add(j + 1, cache);
                }
            }
        }
        System.out.println();

        System.out.println("Отсортированный список чисел по убыванию:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");

    }

}