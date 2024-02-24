package lesson10;

import lesson10.extention.Employee;

public class HourlyEmployee extends Employee {
    private int hourlyRate;

    public HourlyEmployee(String name, double baseSalary, int hourlyRate) {
        super(name, baseSalary);
        this.hourlyRate = hourlyRate;
    }
}
