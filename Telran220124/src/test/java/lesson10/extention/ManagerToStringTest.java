package lesson10.extention;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerToStringTest {
    @Test
    public void testToString() {
        String name = "Max Kirillov";
        int salary = 1200;
        double performance = 2.0;
        Manager e = new Manager(name, salary, performance);
        Assertions.assertEquals(
                "Manager Max Kirillov, 2400.0",
                e.toString());
    }
}
