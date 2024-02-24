package lesson10.extention;
// Manager наследует Employee
// Employee - базовый класс, суперкласс
// Manager - потомок, дочерний класс
public class Manager extends Employee {
    private double performance; // бонус за выполнение плана

    public Manager(String name, double baseSalary, double performance) {
        super(name, baseSalary); //вызов конструктора суперкласса
        this.performance = performance;
    }

    @Override
    public double calculateSalary() { // переопределение метода из базового класса
        return getBaseSalary() * performance;
    }

    @Override
    public String toString() {
        return "Manager " +
                getName() + ", " + calculateSalary();
    }
}
