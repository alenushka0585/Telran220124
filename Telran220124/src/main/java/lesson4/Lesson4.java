package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;

        // && - логичское "и" результат true если оба true
        // ||  - логическое "или" результат true если хотябы один true
        // ! - логическое отрицание

        System.out.println("true && true: " + (true && true)); // true
        System.out.println("true && false: " + (true && false)); // false
        System.out.println("false || false: " + (false || false)); // false
        System.out.println("false || true: " + (false || true)); // true
        System.out.println("!false: " + !false); // true


        int temperature = 22;

        if (temperature > 30 && temperature < 100) { //если выражение true
            System.out.println("Горячо");
        } else if (temperature > 20) { // если выражение false
            System.out.println("Тепло");
        } else {
            System.out.println("Нормально");
        }

        System.out.println(checkPositiveAndEven(-2));

        // == != > < >= <= возращают true или false
        System.out.println(grade(99));
        greeting("Yelena", 'm');

        checkNumbers(1, 3, 3);

    }

    public static boolean checkPositiveAndEven(int a) {
        if (a > 0 && a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String grade(int a) {
        if (a >= 90) {
            return "A";
        } else if (a > 80) {
            return "B";
        } else if (a > 70) {
            return "C";
        } else if (a > 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void greeting(String name, char gender) {
        if (gender == 'f') {
            System.out.println("Здравствуйте, уважаемая " + name);
        } else {
            System.out.println("Здравствуйте, уважаемый " + name);
        }
    }

    public static void checkNumbers (int a, int b, int c){
        if ( a + b == c){
            System.out.println("равны");
        }else {
            System.out.println("не равны");
        }
    }
}

