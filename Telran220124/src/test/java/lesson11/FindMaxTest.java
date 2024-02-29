package lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class FindMaxTest {
    @Test
    public void testFindMax(){
        int[] a = {1,2,3,-10};
        int[]b = {-2,-8,-10,-1};
        Assertions.assertEquals(
                3,
                FindMax.findMax(a)
        );
        Assertions.assertEquals(
                -1,
                FindMax.findMax(b)
        );
    }
}
