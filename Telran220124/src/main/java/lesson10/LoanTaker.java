package lesson10;
// Кредитная заявка
public class LoanTaker {
    private int annualSalary;
    private int age;
    private String name;

    public LoanTaker(int annualSalary, int age, String name) {
        this.annualSalary = annualSalary;
        this.age = age;
        this.name = name;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
