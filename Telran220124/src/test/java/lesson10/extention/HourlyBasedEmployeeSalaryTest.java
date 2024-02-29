package lesson10.extention;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HourlyBasedEmployeeSalaryTest {
    @Test
    public void test360HoursSalary() {
        int salary = 1_200;
        HourlyBasedEmployee hbe = new HourlyBasedEmployee("Max Semenov",
                salary, 360);

        Assertions.assertEquals(
                salary * 2.0,
                hbe.calculateSalary());
    }

    @Test
    public void test90HoursSalary() {
        int salary = 2_200;
        HourlyBasedEmployee hbe = new HourlyBasedEmployee("Ivan Ivanov",
                salary, 90);

        Assertions.assertEquals(
                salary / 2.0,
                hbe.calculateSalary());
    }

    //TDD - Test-driven development - разработка "от теста"
    @Test
    public void testToString() {

    }
}
