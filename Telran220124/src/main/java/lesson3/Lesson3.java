package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        int local = 123; // локальная переменная
        char test = 'G';
        System.out.println("name: " + name);

        Lesson3 l3 = new Lesson3();
        System.out.println("pi: " + l3.pi);
    }

    public double pi = 3.14159; // переменная экземпляра, нужен экземпляр класса
    public static String name = "Berlin"; //статическая переменная, видна везде

    public static void hello() {
        int local = 123; // локальная переменная
        System.out.println("name: " + Lesson3.name);
    }
}
