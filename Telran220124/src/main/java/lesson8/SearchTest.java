package lesson8;

import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        String[] cities = {"Amsterdam", "Milan", "Munich" , "Tokyo", "Antwerp"};
        System.out.println("citySearch Dublin: " + citySearch("Dublin", cities)); // -1
        System.out.println("citySearch Munich: " + citySearch("Munich", cities));

        int [] a = {12, 5, 8, -1, 10};
        System.out.println("before: " + Arrays.toString(a));
        bubbleSort(a);;
        System.out.println("after: " + Arrays.toString(a));
    }

    public static int citySearch (String c, String[] cities) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(c)) {
                return i;
            }
        }
        return -1;
    }

    public static void bubbleSort(int [] a) {
        for (int i = 0; i < a.length; i++) {
            for(int j = 1; j < a.length - i; j++) {
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    /*
    -1 4 5 8 10 12 - как должно быть
    12 4 5 8 -1 10 - как есть

    4 12 5 8 -1 10 - сортировка пузырьком
    4 5 12 8 -1 10
    4 5 8 12 -1 10
    4 5 8 -1 12 10
    4 5 8 -1 10 12
    4 5 8 -1 10
    4 5 8 -1 10
    4 5 -1 8 10
    4 5 -1 8 10
    4 5 -1 8
    4 -1 5 8
    4 -1 5 8
    4 -1 5
    -1 4 5
     */
}
