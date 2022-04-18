package task;

import java.util.ArrayList;
import java.util.Scanner;

/* 1. Вывести числа в обратном порядке

Ввести с клавиатуры 10 чисел и заполнить ими список.
Используя цикл for вывести их в обратном порядке. */

public class backwardNumbers {

    ArrayList<Integer> list = new ArrayList<>();

    backwardNumbers () {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Задание №1:\nВвести с клавиатуры 10 чисел и вывести их в обратном порядке.");
        System.out.println();

        System.out.println("Ну поехали... Введите свои числа ниже.");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ваше число №" + (i + 1) + ": ");
            int cache = scanner.nextInt();
            list.add(cache);
        }
        System.out.println();

        System.out.print("Наш список чисел задом наперед: ");
        for (int i = list.size() - 1; i >= 0; i--)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

}