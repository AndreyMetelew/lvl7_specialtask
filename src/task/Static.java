package task;

/* 7. Переставь один модификатор static

Переставь один модификатор static, чтобы пример скомпилировался. */

public class Static {

    public static int a = 5;
    public static int b = 2;
    public int c = a * b; // Здесь убран static

    public String getValue() {
        String s;
        s = a + " + " + b + " = " + c;
        return s;
    }

}