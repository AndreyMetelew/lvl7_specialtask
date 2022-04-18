package task;

/* 5. Бум
Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); // Задержка на одну десятую секунды. */

public class Boom {

    int counter = 30;

    Boom () throws InterruptedException {

        System.out.println();
        System.out.println("""
                Задание №5:
                Создать счетчик обратного отсчета, уменьшающийся с 30 до 0.
                Программа уменьшает счетчик 10 раз в секунду с помощью функции Thread.sleep(100)""");
        System.out.println();

        System.out.println("Отсчет пошел:");
        while (counter >= 0) {
            System.out.println(counter);
            counter--;
            Thread.sleep(100);
        }
        System.out.println("БУМ!");
        System.out.println();

    }

}