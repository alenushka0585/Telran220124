package lesson6;

public class Lesson6HomeWork {
    // 1. Напишите функцию-калькулятор должна принимать два числа double
    // и операцию над ними - символ '*', '/', '+' или '-' и возвращать результат этой операции

    public static double calculator(double a, double b, char c) {
        return switch (c) {
            case '*' -> a * b;
            case '/' -> a / b;
            case '+' -> a + b;
            case '-' -> a - b;
            default -> 0;
        };
    }

    // 2. Напишите функцию, которая принимает параметр А и перебирает все числа
    // от 1 до A с шагом 1 и печатает только числа, кратные 5, 7 или 13

    public static void printDividedBy5Or7Or13(int a) {
        for (int x = 1; x <= a; x++) {
            if (x % 5 == 0 || x % 7 == 0 || x % 13 == 0) {
                System.out.println(x);
            }
        }
    }

    // 3. Распечатайте все числа Фибоначчи от 1 до 500.
    // Про числа Фибоначчи можно прочитать в википедии, если кратко,
    // каждое следующее число получается из суммы двух предыдущих: 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8 и т.д.
    public static void fibanachy() {
        int nextNumber = 1;
        int previousNumber = 0;
        int result = 1;
        while (nextNumber <= 500) {
            result = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = result;
            if (result > 500) {
                break;
            }
            System.out.println(result);
        }
    }

    // 4. Напишите функцию для вычисления суммы цифр любого целого числа. Пример: 234->9

    public static int sum(int a) {
        String number = "" + a;
        int sum = 0;
        for (int x = 0; x < number.length(); x++) {
            sum = sum + Integer.parseInt(number.substring(x, x + 1));
        }
        return sum;
    }


    //5. Напишите функцию для обращения строки. Пример: "Миша" -> "ашиМ"

    public static String convertTheLineOnTheContrary(String a) {
        String result = "";
        for (int x = a.length() - 1; x >= 0; x--) {
            result = result + a.charAt(x);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculator(-2, 2, '/'));
        System.out.println(calculator(2, 2, '*'));
        System.out.println(calculator(2, 2, '+'));
        System.out.println(calculator(3, 2, '-'));
        System.out.println("______________________________");

        printDividedBy5Or7Or13(16);
        System.out.println("______________________________");

        fibanachy();
        System.out.println("______________________________");

        System.out.println(sum(354872));
        System.out.println("______________________________");

        System.out.println(convertTheLineOnTheContrary("Митя"));
        System.out.println("______________________________");
    }
}
