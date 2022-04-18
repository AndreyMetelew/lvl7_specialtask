package task;

import java.util.ArrayList;
import java.util.Scanner;

/* 3. Максимальное и минимальное числа в массиве

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел. */

public class maxAndMin {

    ArrayList<Integer> list = new ArrayList<>();

    maxAndMin () {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("""
                Задание №3:
                Нужно создать массив из 20 (в дальнейшем 5) чисел и заполнить его с клавиатуры.
                После, надо найти максимальное и минимальное значение в массиве и вывести их через пробел.""");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число №" + (i + 1) + ": ");
            list.add(scan.nextInt());
        }
        System.out.println();

        int min = list.get(0);
        int max = list.get(0);

        System.out.println("Ищем в массиве минимальное и максимальное значение...");
        System.out.println();
        for (Integer integer : list) {
            if (integer > max)
                max = integer;
            if (integer < min)
                min = integer;
        }
        System.out.println("Максимальное значение: " + max + "\nМинимальное значение: " + min);

    }

}