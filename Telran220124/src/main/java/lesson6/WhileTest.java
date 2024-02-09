package lesson6;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        int i = 1;// переменная
        while (i < 6) { // инициализация переменной цикла роисходит снаружи, а инкремент внутри
            System.out.println("Hello world " + i);
            i++; // инкремент
        }
        System.out.println("______________________");

        int x = 1, sum = 0; // возможность создовать и инициализировать переменные одного типа
        while (x <= 10) {
            sum += x;
            x += 2;
        }

        System.out.println(sum);
        System.out.println("______________________");

        // попросим пользователя ввести число больше 5
        // если число меньше 5 попросим еще раз
        Scanner scanner = new Scanner(System.in);
        int d;
        do {
            System.out.println("Введите число больше 5");
            d = scanner.nextInt();

        } while (d <= 5);

            System.out.println("Вы ввели " + d);
        System.out.println("______________________");

        int credit = 0;
        int month = 0;
        while (credit <= 2100){
            month++;
            credit += 50 + 0.8*50 + 0.8*50*0.75;
        }
        System.out.println( "month " + month);
        System.out.println("______________________");

    } // main
}
