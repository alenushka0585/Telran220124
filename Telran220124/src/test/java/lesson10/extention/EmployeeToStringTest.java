package lesson10.extention;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeToStringTest {
    @Test
    public void testToString() {
        String name = "Max Kirillov";
        int salary = 1200;
        Employee e = new Employee(name, salary);
        Assertions.assertEquals(
                "Employee Max Kirillov, 1200.0",
                e.toString());
    }
}
