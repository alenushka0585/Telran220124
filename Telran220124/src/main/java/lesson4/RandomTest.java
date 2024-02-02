package lesson4;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(20);// диапазон от 0 - 19
        System.out.println(randomInt);

        int randomFrom10to15 = random.nextInt(6) + 10;

        double randomDouble = random.nextDouble(); // генерация от 0 до 1

    }
}
