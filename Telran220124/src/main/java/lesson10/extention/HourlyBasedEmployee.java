package lesson10.extention;

public class HourlyBasedEmployee extends Employee {
    private int monthlyHours;

    public int getMonthlyHours() {
        return monthlyHours;
    }

    public void setMonthlyHours(int monthlyHours) {
        this.monthlyHours = monthlyHours;
    }

    public HourlyBasedEmployee(String name, double baseSalary, int monthlyHours) {
        super(name, baseSalary);
        this.monthlyHours = monthlyHours;
    }

    @Override
    public double calculateSalary() {
        return monthlyHours * getBaseSalary() / 180;
    }

    @Override
    public String toString() {
        return "HourlyBasedEmployee " +
                getName() +", " + calculateSalary();
    }
}
