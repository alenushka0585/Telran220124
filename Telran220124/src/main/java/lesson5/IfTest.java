package lesson5;

public class IfTest {
    public static void main(String[] args) {
        int x = 70;
        double y = 15.4;
        if (x > 30 && x < 50 && x != 5) {

        }
        if (y == 5.5 || y == 10 || y == 8.3) {

        }

        if (y == 5.5 && y == 15.4) {

        }

        if (x > 10) {
            System.out.println("111");
        } else {
            System.out.println(222);
        }
        saunaTemperature(92);
        saunaTemperature(32);
        saunaTemperature(52);

        int l = 3;
        int k = 3;
        System.out.println("l == k " + (l == k));

        String i = "IVAN";
        String j = "ivan".toUpperCase();
        System.out.println("i = " + i + ", j =" + j);

        System.out.println("i == j " + (i == j)); // false
        // для ссылочных типов сравнение на идентичность,
        // сравнивает место в памяти

        //проверка на эквивалетность для ссылочных типов
        System.out.println( "i == j " + i.equals(j) );

    }

    public static void saunaTemperature(int t) {
        if (t > 90) {
            System.out.println("горячо");
        } else if (t > 60) {
            System.out.println("хорошо");
        } else if (t > 45) {
            System.out.println("тепло");
        } else {
            System.out.println("не сауна");
        }
    }
}
