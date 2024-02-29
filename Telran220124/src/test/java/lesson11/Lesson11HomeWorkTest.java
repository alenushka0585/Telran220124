package lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson11HomeWorkTest {
    @Test
    public void getSecondWordTest(){
        String s1 = "зеленое море и синее небо";
        String s2 = "Жизнь";
        Assertions.assertEquals(
                "море",
                Lesson11HomeWork.getSecondWord(s1));
        Assertions.assertNull(
                Lesson11HomeWork.getSecondWord(s2)
        );
    }
}
