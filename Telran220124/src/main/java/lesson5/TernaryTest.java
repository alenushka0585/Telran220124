package lesson5;

public class TernaryTest {
    public static void main(String[] args) {
        String climate;
        int temperature = 56;

        if (temperature > 40) {
            climate = "warm";
        } else {
            climate = "cold";
        }

        int height = 400;
        //               условие          true       false
        String depth = (height > 200) ? "глубоко" : "мелко";

        int n1 = 23;
        int n2 = 55;
        int max = n1 > n2 ? n1 : n2;

        System.out.println(max);

        int total = -200;
        int abs = total > 0 ? total : -total;
        System.out.println(abs);

        int result = n1 > n2 ? (n1 - n2) : (n2 - n1);
    }
}
