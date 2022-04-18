package task;

import java.util.ArrayList;
import java.util.Scanner;

/* 4. Вводить с клавиатуры строки, пока пользователь не введёт строку “end”.

Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку “end”. Строку “end” не учитывать.
Вывести строки на экран, каждую с новой строки. */

public class endOfTheLine {

    ArrayList<String> list = new ArrayList<>();

    endOfTheLine () {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("""
                Задание №4:
                Создать список строк и ввести их с клавиатуры. Ввод совершать до фразы “end”, не занося ее в список.
                После, надо вывести эти строки на экран, каждую с новой строки.""");
        System.out.println();

        System.out.println("Ну поехали... Введите свои строки ниже." +
                "\nНапоминаем, чтобы прекратить ввод, введите “end”. Он не будет добавлен в список строк.");
        for (int i = 0; true; i++) {
            System.out.print("Введите строку №" + (i + 1) + ": ");
            String cache = scan.nextLine();
            if (cache.equals("end")) {
                System.out.println("Хорошо, прекращаем ввод.");
                break;
            }
            list.add(cache);
        }
        System.out.println();

        System.out.println("Полученный список строк:");
        for (int i = 0; i < list.size(); i++)
            System.out.println("Строка №" + (i + 1) + ": " + list.get(i));
        System.out.println();

    }

}