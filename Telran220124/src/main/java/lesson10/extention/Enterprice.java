package lesson10.extention;

public class Enterprice {
    public static void main(String[] args) {
        Employee e1 = new Employee("Max Kotkov", 1_300);
        System.out.println("Max salary: " + e1.calculateSalary());

        Manager m1 = new Manager("Luk Semenov", 1200, 1.2);
        System.out.println("Luk salary: " + m1.calculateSalary());

        Employee m2 = new Manager("Nuka Skorobogatova", 1_100, 1.4);
        System.out.println("Nika salary " + m2.calculateSalary());

        //полиморфизм - по ссылке на базовый класс вызывается
        // переопределенный функционал

        e1.ping();
        printEmployee( // анонимный внутренний класс
                new Employee("Alex", 1100) {
                    public void test() {
                    }
                }
        );
        Employee h1 = new HourlyBasedEmployee("Petr Ivanov", 1_500, 90);
        Employee h2 = new HourlyBasedEmployee("Mariya Semenova", 1_250, 360);

        System.out.println("________________________________________________________");

        System.out.println(e1);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(h1);
        System.out.println(h2);

    }


    public static void printEmployee(Employee e) {

    }
}
