package lesson3;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        System.out.println("Enter your name");
      Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine(); // считать строку
//        System.out.println("Hello, " + name);
//        System.out.println("Enter you salary");
//        int salary = scanner.nextInt();
//        System.out.println("Hello, " + name + ", your salary is " + salary);

        System.out.println("Укажите радиус окружности в виде дробного числа");
        double radius = scanner.nextDouble();
        double square = 3.14159 * radius * radius;
        System.out.println("Площадь круга: " + square);
    }
}
