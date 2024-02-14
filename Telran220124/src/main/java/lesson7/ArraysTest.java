package lesson7;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int [] d = {4, 8, -1, 12, 43};
        int [] r = Arrays.copyOf(d, 2); // создает копию массива с начало указанной длины

        System.out.println(Arrays.toString(r));
        System.out.println("________________");

        int [] s = Arrays.copyOfRange(d, 2,4);
        System.out.println(Arrays.toString(s)); // копия с определенного индекса до указанного индекса

        Arrays.sort(d); // сортировка массива
        System.out.println(Arrays.toString(d));
    }
}
