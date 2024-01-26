package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        // встроенные типы данных / примитивные типы
        // boolean - логический true/false
        // числовые:
        // byte 1 байт = 8 бит -128 до 127
        // short 2 байт
        // int 4 байт
        // long 8 байт
        // float
        // double

        boolean myBoolean = true;
        byte myByte = 127;
        short myShort = 15000;
        int myInt = 500000;
        long myLong = 50000000;

        myByte++;

        System.out.println("myByte = " + myByte);

        int first = 12;
        int second = 7;

        System.out.println("+ " + (first + second));
        System.out.println("- " + (first - second));
        System.out.println("/ " + (first / second));
        System.out.println("* " + (first * second));
        System.out.println("% " + (first % second)); // 12 / 7 = 1  12 - (7 * 1) = 5 остаток от деления

        float myFloat = 6.5f; // f суффикс для float значений
        double myDouble = 6.5;

        myByte =(byte) myInt; // явное приведение int в byte с возможной потерей точности

        char myChar = 'g'; // символ из Unicode 2 байта (0 до 65000)

        double pi = 3.14159;
        int radius = 6;


        System.out.println("Площадь " + (pi * (radius * radius)));

        int a = 2;
        a = a * 12;

        int b = 3;
        b *=10; // b = b * 10

        int i5 = 5;
        int i2 = 2;
        int i3 = i5 / i2;

        System.out.println(i3);

        double d5 = 5;
        double d2 = 2;
        double var6 = d5 / d2;
        System.out.println(var6);

        double var7 = i5 / i2;
        System.out.println(var7);

        double var25 = i5 / d2;
        System.out.println(var25);

        double var26 = i5 / i2 + i5 / d2;
        System.out.println(var26);

        int var28 = (int) (d5/d2);
        System.out.println(var28);

        // ссылочные типы данных
        //String

        String city = "London is the capital of Great Britain";
        String paris = " Paris";
        String result = city + paris;
        System.out.println(result);

        int numberOfFishInOcean = 345_234_455; // можно отделять разряды
        double bigNumber = 1.225e+16; // 1.225 * 10^16

    }
}
