package lesson3;

public class MethodTest {
    //static означает, что метод определен для класса целеком
    public static void main(String[] args) {
       int result = sum(5, 6);
        System.out.println("sum: " + result);
        double area = ellipseArea(10, 20);
        System.out.println("area: " + area);

        greetings("Max");

        System.out.println("равны " + (3 == 3));
        System.out.println(isEven(7));

        System.out.println(firstWord("Hallo Max, I'm Lucy"));

        MethodTest exemplar = new MethodTest();
        System.out.println(exemplar.toUpper("hello world"));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double ellipseArea(double a, double b) {
        return 3.14159 * a * b;
    }

    public static void greetings(String name){
        // void отсутствие возращаемого значения
        System.out.println("Hello, " + name + "!");

    }

    // 33 % 2 == 1 - нечетное или false
    // 32 % 2 == 0 - четное число или true

    public static boolean isEven (int a){
        int result = a % 2; // 0 или 1
        return result == 0;
    }

    public static String firstWord (String a){
        int index = a.indexOf(" ");
        return a.substring(0, index);
    }

    public String toUpper (String s){
        return s.toUpperCase().replaceAll(" ", "");
    }

    // public - виден всем классам
    // private - виден только методам этого класса
    // protected - доступен другим методам класса и потомкам этого класса
    // - package private если не указан индификатор доступа, то доступен только пакету
}
