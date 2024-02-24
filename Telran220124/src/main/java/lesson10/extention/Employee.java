package lesson10.extention;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }

    private void hello(){
        System.out.println("Hello!");
    }

    protected void ping(){
        hello();
        System.out.println("ping " + name);
    }

    @Override
    public String toString() {
        return "Employee " + getName()+ ", " + calculateSalary();
    }
}
