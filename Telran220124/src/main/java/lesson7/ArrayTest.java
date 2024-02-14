package lesson7;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int a = 6;
        String s = "Tokyo";

        // int [] - масив целых
        int[] c = new int[]{10, 20, 14, -2};
        System.out.println("length of massive s " + c.length);
        System.out.println("второй элемент массива " + c[1]);

        c[1] = 111;
        System.out.println("второй элемент массива после изменения " + c[1]);

        // после создания массива определенной длины нельзя изменить длинну массива,
        // и удалить так же
        printArray(c);
        System.out.println("\n" + "______________");

        String[] groups = new String[]{
                "Rolling Stones", "Guns and Roses",
                "Aerosmith", "Iron Maiden", "AC/DC" };
        System.out.println(groups[4]);
        System.out.println("______________");

        System.out.println(groups); // печатает адрес массива
        System.out.println(Arrays.toString(groups)); // распечатать массив
        System.out.println("______________");

        groups[2] = "Beatles";

        System.out.println(Arrays.toString(groups));
        System.out.println("______________");

        double[] temperature = {14.55, 23.33, 21.99}; // современный способ инициализации массивов
        double[] t = new double[]{14.55, 23.33, 21.99};

        int[] classes = new int[5]; // 5 колличество эллементов в массиве
        // значение по-умолчанию
        //для числовых 0
        // для boolean - false
        // для ссылочных - null

        System.out.println(Arrays.toString(classes));
        for (int x = 0; x < classes.length; x++) {
            classes[x] = x * 3;
        }

        System.out.println(Arrays.toString(classes));
        System.out.println("______________");

        System.out.println(sumIntArray(classes));
        System.out.println("______________");

        classes[2] = 25;

        System.out.println(max(classes));
        System.out.println("______________");

        for (int x = 0; x < groups.length; x++) {
            System.out.println(x  + ":" + groups[x]);
        }

        System.out.println("______________");

        for (int x = 0; x < groups.length; x++) {
            groups[x] = groups[x].toUpperCase();
        }
        System.out.println(Arrays.toString(groups));
        System.out.println("______________");

        System.out.println(contains(c, 14));
        System.out.println(Arrays.toString(c));
        System.out.println("______________");

        Arrays.sort(groups);
        System.out.println(Arrays.toString(groups));
        System.out.println("______________");

    }

    public static void printArray(int[] a) {
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
    }

    public static int sumIntArray(int[] a) {
        int sum = 0;
        for (int x = 0; x < a.length; x++) {
            sum += a[x];
        }
        return sum;
    }

    public static int max (int [] a){
        int max = 0;
        for (int x = 0; x < a.length; x++) {

            max = max > a[x]? max : a[x];
//            if (max > a[x]) {
//            } else {
//                max = a[x];
//            }
        }
        return max;
    }

    public static boolean contains (int [] a, int b){
        for (int x = 0; x < a.length; x++) {
            if (a[x] == b) {
                return true;
            }
        }
        return false;
    }
}
