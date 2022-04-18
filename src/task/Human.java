package task;

/* 6. Семья

Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран. */

public class Human {

    String name;
    int age;
    boolean isGenderMale;
    Human father, mother;

    Human (String name, int age, boolean isGenderMale) {
        this.age = age;
        this.name = name;
        this.isGenderMale = isGenderMale;
    }

    public void whoIsMother (Human mother) {
        if (mother.isGenderMale)
            this.father = mother;
        else this.mother = mother;
    }

    public void whoIsFather (Human father) {
        if (father.isGenderMale)
            this.father = father;
        else this.father = mother;
    }

    public String toString () {
        String info;
        info = "Имя: " + name + ", пол: ";
        if (isGenderMale)
            info = info + "мужской";
        else info = info + "женский";
        info = info + ", возраст: " + age;
        if (father != null)
            info = info + ", отец: " + father.name;
        if (mother != null)
            info = info + ", мать: " + mother.name;
        return info;
    }

}