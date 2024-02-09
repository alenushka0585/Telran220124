package lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        int i = 10;
        int j = ++i; // преинкремент, сначала увеличиваеим i на 1 и потом возвращаем значение

        System.out.println("i " + i + " j " + j);
        System.out.println("______________");

        int k = 10;
        int m = k++; // постинкремент, сначала возвращаем значение, а потом увеличиваем значение переменной
        System.out.println("k " + k + " m " + m);
        System.out.println("______________");

        // -- ++
        //  инициализация   условие     изменение переменной цикла
        int sum = 0;
        for (int c = 0; c < 5; c++) {
            sum += c;
            System.out.println("Hello, world!");
            System.out.println("The sum is " + sum);
        }
        System.out.println("______________");

        System.out.println("The sum is " + sum);
        System.out.println("______________");

        for (int p = 6; p < 11; p += 2) {
            System.out.println(p);
        }

        System.out.println("______________");
        stepSum(3, 15, 3);
        System.out.println("______________");

        picture(5);

        for (int d = 1; d <= 5; d++) // 1 2 3 4 5
        {
            for (int e = 1; e <= 5; e++) {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println("______________");

        for (int x = 1; x <= 17; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz " + x);
            } else if (x % 3 == 0) {
                System.out.println("Fizz " + x);
            } else if (x % 5 == 0) {
                System.out.println("Buzz " + x);
            } else {
                System.out.println(x);
            }
        }
        System.out.println("______________");

        System.out.println(factorial(7));
        System.out.println("______________");


    }

    public static int stepSum(int i, int j, int s) {
        int sum = 0;
        for (int x = i; x <= j; x += s) {
            sum += x;
            System.out.println(x);
        }
        System.out.println(sum);
        return sum;
    }

    public static void picture(int x) {
        String z = "+";
        for (int d = 1; d <= x; d++) {
            System.out.println(z);
            z += "+";
        }
    }

    public static int factorial(int a) {
        // 7! =1*2*3*4*5*6*7
        int result = 1;
        for (int x = 1; x <= a; x++) {
            result *= x;
        }
        return result;
    }
}
