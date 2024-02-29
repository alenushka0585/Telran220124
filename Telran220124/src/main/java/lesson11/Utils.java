package lesson11;

import java.util.Arrays;

public class Utils {
    public static int[] getArray(int a) {
        if (a < 0) {
            return null;
        }
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray(4)));
    }
}
