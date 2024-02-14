package lesson7;

import java.util.Arrays;

public class Lesson7HomeWork {
//    1. Напишите функцию, которая делает все элементы массива положительными
//    public static void makeArrayElementsPositive(int [] a)
//    {1,-4, 2, -7, 12} -> {1,4, 2, 7, 12}

    public static void makeArrayElementsPositive(int[] a) {
        for (int x = 0; x < a.length; x++) {
            a[x] = a[x] < 0 ? a[x] * (-1) : a[x];
        }
    }

//    2. Напишите функцию которая вернет true если в массиве есть отрицательные элементы
//    public static boolean hasNegative(int [] a)
//    {1,-4, 2, -7, 12} -> true
//    {1,4, 2, 7, 12} -> false

    public static boolean hasNegative(int[] a) {
        for (int x = 0; x < a.length; x++) {
            if (a[x] < 0) {
                return true;
            }
        }
        return false;
    }

//    3. Напишите функцию которая поменяет порядок элементов массива
//    public static void reverse(int [] a)
//    {1,3,10,12} -> {12, 10, 3, 1}

    public static void reverse(int[] a) {
        int[] result = new int[a.length];
        int length = 0;
        for (int x = a.length - 1; x > 0; x--) {
            result[length] = a[x];
            length++;
        }
        for (int x = 0; x < result.length; x++) {
            a[x] = result[x];
        }
    }

//    4. Напишите функцию считающую сложные проценты через for

    public static double percentSum(int initialSum, double percent, int duration) {
        double percentSum = 0;
        double totalSum = initialSum;
        for (int x = 0; x < duration; x++) {
            percentSum += totalSum * percent;
            totalSum += totalSum * percent;
        }
        return percentSum;
    }

//    5. Напишите функцию которая печатает "елочку" передаваемой в нее  высоты. Пример для 4
//            *
//            ***
//            *****
//            *******

    public static void firTree(int height) {
        for (int a = 1; a <= height; a++) {
            for (int b = 0; b < height - a; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    6. Написать функцию, возвращающую массив из букв передаваемой в нее строки

    public static String[] array(String a) {
        String[] result = new String[a.length()];
        for (int x = 0; x < a.length(); x++) {
            result[x] = "" + a.charAt(x);
        }
        return result;
    }

    //    7. Напишите функцию, принимающую на вход два массива, и возвращающую новый массив,
//    состоящий из элементов первых двух, {1,5}, {45, 2, 5} -> {1,5,45,2,5}
    public static int[] newArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int length = 0;
        for (int c = 0; c < a.length; c++) {
            result[c] = a[c];
            length++;
        }
        for (int c = 0; c < b.length; c++) {
            result[length] = b[c];
            length++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] first = {1, -4, 2, -7, 12};

        System.out.println(" Задание №1____________________________________");
        makeArrayElementsPositive(first);
        System.out.println(Arrays.toString(first));

        System.out.println(" Задание №2____________________________________");
        System.out.println(hasNegative(first));
        int[] second = {1, -4, 2, -7, 12};
        System.out.println(hasNegative(second));

        System.out.println(" Задание №3____________________________________");
        int[] third = {1, 3, 10, 12};
        reverse(third);
        System.out.println(Arrays.toString(third));

        System.out.println(" Задание №4____________________________________");
        System.out.println(percentSum(100, 0.1, 3));

        System.out.println(" Задание №5____________________________________");
        firTree(4);

        System.out.println(" Задание №6____________________________________");
        System.out.println(Arrays.toString(array("Hello world")));

        System.out.println(" Задание №7____________________________________");
        int[] forth = {1, 5};
        int[] fifth = {45, 2, 5};
        System.out.println(Arrays.toString(newArray(forth, fifth)));
    }
}
