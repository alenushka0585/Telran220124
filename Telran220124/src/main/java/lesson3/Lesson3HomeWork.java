package lesson3;

public class Lesson3HomeWork {
    //  1. Написать функцию, которая принимает на вход 3 параметра
    //  - имя, фамилию и возраст и выводит их на экран построчно
    public static void nameAndAge(String firstName, String lastName, int age) {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    public static void main(String[] args) {
        nameAndAge("Yelena", "Shtentsel", 38);
        System.out.println("________________________________________________________");

        //  2. Вырезать из строки "Вход запрещен сегодня" второе слово и заменить его на "разрешен".
        String string = "Вход запрещен сегодня";
        System.out.println(string.replace("запрещен", "разрешен"));
        System.out.println("________________________________________________________");

        //  3. Написать функцию для вычисления длины окружности, принимающую радиус
        System.out.println(lengthOfTheCircle(5.5));
        System.out.println("________________________________________________________");
    }

    public static Double lengthOfTheCircle(Double radius) {
        return 2 * 3.14159 * radius;
    }
}
