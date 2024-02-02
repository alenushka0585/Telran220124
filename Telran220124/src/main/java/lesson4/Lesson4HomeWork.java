package lesson4;

public class Lesson4HomeWork {
    // 1 Напишите функцию, которая проверяет, что число  делится на 5 или на 7
    // - должна возвращать true/false - пример: 14->true, 11->false, 15->true
    public static boolean divided5Or7(int a) {
        if (a % 5 == 0 || a % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //2 Напишите функцию, которая проверяет, является ли год високосным или нет
    // - должна принимать год и возвращать true/false - про високосный год можно прочитать в википедии
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    // 3 Напишите функцию, которая принимает два целых числа от 25 до 75 и возвращает true,
    // если в обоих числах есть общая цифра - пример: 43,14-> true, 71,23-> false

    public static boolean hasSameNumber(int a, int b) {
        int firstA = a / 10;
        int secondA = a - firstA * 10;
        int firstB = b / 10;
        int secondB = b - firstB * 10;

        if (firstA == firstB || firstA == secondB
                || secondA == firstB || secondA == secondB) {
            return true;
        } else {
            return false;
        }
    }

    // 4 Напишите функцию, принимающую целое число (секунды) и печатающую
    // часов:минут:секунд - например: 3662 -> 1:1:2

    public static void time(int s) {
        int hour = s / 3600;
        int min = (s - (hour * 3600)) / 60;
        int second = s - (hour * 3600) - (min * 60);

        System.out.println(hour + ":" + min + ":" + second);
    }
    // 5 Напишите функцию калькулятор курсов валюты -
    // принимает сумму в евро и символ валюты, в которую нужно перевести -
    // R - рубль
    // D - доллар
    // Y - йена
    // G - фунт стерлингов
    // должна возвращает сумму в выбранной валюте
    // внутри функции воспользуйтесь найденным в интернет актуальным курсом обмена

    public static double currencyConvert(double sum, char currency) {
        double result = 0;
        if (currency == 'R') {
            result = sum * 98.28;
        } else if (currency == 'D'){
            result = sum * 1.08;
        }else if (currency == 'Y') {
            result = sum * 159.88;
        } else if (currency == 'G'){
            result = sum * 0.85;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(divided5Or7(15));
        System.out.println("________________________________");

        System.out.println(isLeapYear(2024));
        System.out.println("________________________________");

        System.out.println(hasSameNumber(48, 54));
        System.out.println("________________________________");

        time(3722);
        System.out.println("________________________________");

        System.out.println(currencyConvert(1000, 'G'));
    }
}
