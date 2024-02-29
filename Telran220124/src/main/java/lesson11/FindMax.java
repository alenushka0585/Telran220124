package lesson11;

import java.util.Arrays;

public class FindMax {
    public static int findMax(int[]a){
        Arrays.sort(a);
        return a[a.length-1];
    }
}
