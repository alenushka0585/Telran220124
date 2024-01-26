package lesson2;

public class Lesson2Vars {
    public static void main(String[] args) {
        int localVariable = 3; // локальная переменная для метода

        Lesson2Vars l1 = new Lesson2Vars();
        l1.city = "Berlin";

        Lesson2Vars l2 = new Lesson2Vars();
        l2.city = "Brussels";

        System.out.println(Lesson2Vars.age);

        //             0123456789
        String city = "My city is Reims";
        System.out.println(city.length()); // длина строки в символах
        System.out.println(city.charAt(8));
        System.out.println(city.substring(3,7));
        System.out.println(city.substring(11));

    }

    public static void another() {
        int localVariable = 44; // локальная переменная / local variable
    }

    public String city = "Dusseldorf"; // переменная экземпляра, относится к каждому экземпляру класса
                                        // / instance variable

    public static double age = 33.44; // статическая переменная, относится к классу целиком /static variable
}
