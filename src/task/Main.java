package task;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Вывод задания №1
        backwardNumbers task1 = new backwardNumbers();

        // Вывод задания №2
        MAndN task2 = new MAndN();

        // Вывод задания №3
        maxAndMin task3 = new maxAndMin();

        // Вывод задания №4
        endOfTheLine task4 = new endOfTheLine();

        // Вывод задания №5
        Boom task5 = new Boom();

        // Вывод задания №6

        System.out.println();
        System.out.println("""
                Задание №6:
                Создать класс Human с полями имени, пола, возраста, отца и матери.
                Затем нужно создать двух бабушек, двух дедушек, маму, папу и трех детей
                и вывести информацию о них методом toString типа String""");
        System.out.println();

        Human Mama = new Human("Мария", 37, false);

        Human Papa = new Human("Саша", 38, true);

        Human Babushka1 = new Human("Зина", 65, false);
        Human Dedushka1 = new Human("Игнат", 63, true);
        Mama.whoIsMother(Babushka1);
        Mama.whoIsFather(Dedushka1);

        Human Babushka2 = new Human("Лариса", 67, false);
        Human Dedushka2 = new Human("Василий", 69, true);
        Papa.whoIsMother(Babushka2);
        Papa.whoIsFather(Dedushka2);

        Human sinok1 = new Human("Гриша", 16, true);
        sinok1.whoIsMother(Mama);
        sinok1.whoIsFather(Papa);

        Human dochka = new Human("Маша", 8, false);
        dochka.whoIsMother(Mama);
        dochka.whoIsFather(Papa);

        Human sinok2 = new Human("Миша", 13, true);
        sinok2.whoIsMother(Mama);
        sinok2.whoIsFather(Papa);

        System.out.println(sinok1.toString());
        System.out.println(sinok2.toString());
        System.out.println(dochka.toString());
        System.out.println(Mama.toString());
        System.out.println(Papa.toString());
        System.out.println(Babushka1.toString());
        System.out.println(Dedushka1.toString());
        System.out.println(Babushka2.toString());
        System.out.println(Dedushka2.toString());

        // Вывод задания №7
        Static task7 = new Static();
        System.out.println(task7.getValue());

        // Вывод задания повышенной сложности №1
        System.out.println();
        System.out.println("Задание №1 повышенной сложности:" +
                "\nВвести с клавиатуры данные про котов и вывести их на экран.");
        System.out.println();

        Cats cat1 = new Cats();
        cat1.getInfo();
        Cats cat2 = new Cats();
        cat2.getInfo();

        // Вывод задания повышенной сложности №2
        Functionality specialTask2_1 = new Functionality();
        Functionality.newFunctionality specialTask2_2 = new Functionality.newFunctionality();

        // Вывод задания повышенной сложности №3
        Algorythm specialTask3 = new Algorythm();

    }

}