package lesson11;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static lesson11.Utils.getArray;

public class UtilsTest {
    @BeforeAll
    public static void before(){
        System.out.println("before");
    }

    @AfterAll
    public static void after(){
        System.out.println("after");
    }

    @BeforeEach // будет выполнянтся перед каждым тестом
    public void init(){
        System.out.println("init");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("tearDown");
    }

    @Test
    public void getArrayTest() {
        int a = 5;
        Assertions.assertEquals(
                "[1, 2, 3, 4, 5]",
                Arrays.toString(getArray(a)));
    }

//    @Test
//    public void testArray() {
//       int size = -5;
//        int[] a = getArray(size);
//        Assertions.assertEquals(
//                size,
//                a.length);
//        Assertions.assertNotNull(a);
//        Assertions.assertNull(a);
//    }

    @Test
    public void testFirstArrayElement() {
        int first = 1;
        int last = 5;
        int size = 5;
        int[] a = getArray(size);
        Assertions.assertEquals(
                first,
                a[0]);

        Assertions.assertEquals(
                last,
                a[last - 1]);

        int[] c = {1, 2, 3, 4, 5};
        // массивы так лучше не сравнивать
        //  Assertions.assertEquals(
        //        c,
        //        a);
        Assertions.assertArrayEquals(
                c,
                a
        );
    }


}
