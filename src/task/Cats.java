package task;

/* 1. Нужно исправить программу, чтобы компилировалась и работала.

Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.

Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20 */

import java.util.Scanner;

public class Cats {

    String name;
    int age, weight, tail;

    Cats () {

        Scanner scanner = new Scanner(System.in);

        System.out.print("У нас новый котик! Как его зовут? - ");
        name = scanner.nextLine();
        System.out.print("Сколько лет котику? - ");
        age = scanner.nextInt();
        System.out.print("Сколько котик весит (в кг)? - ");
        weight = scanner.nextInt();
        System.out.print("Какова длина хвоста нашего котика (в см)? - ");
        tail = scanner.nextInt();

        System.out.println();

    }

    public void getInfo () {
        System.out.println("Нашего котика зовут " + name + ", ему " + age + ", его вес - " + weight + "кг, длина его хвоста - " + tail + "см.\n");
    }

}