package lesson9;

import java.util.Arrays;
import java.util.Random;

public class StringRecap {
    public static void main(String[] args) {
        String description = "London is the capital of Great Britain";
        String[] words = description.split(" "); // разделитель
        System.out.println(Arrays.toString(words));

        String[] iArray = description.split("i");
        System.out.println(Arrays.toString(iArray));

        System.out.println(Arrays.toString("London".split("")));

        String name = "Max";
        name = name.toUpperCase();
        System.out.println(name);
        // String в java неизменяемый

        String str1 = "Java";
        String str2 = "Java";

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1.equals(str2) " + (str1.equals(str2)));

        System.out.println("str3 == str4 " + (str3 == str4));
        System.out.println("str3.equals(str4) " + (str3.equals(str4)));

        String n = "Max Kotkov";
        System.out.println((n.split(" "))[1]);

        //каждый раз при изменении строки создается новый объект
        String anna = "Anna";
        anna += " ";
        anna += "Vasilieva";


        // новый объект не создается
        StringBuilder b = new StringBuilder();
        b.append("Max");
        b.append(" ");
        b.append("Semenov");
        System.out.println(b.toString());
        // append("..") - добавление строки
        // delete(first, last) - удажение символов между first и lAast
        //reverse
        //length()
        //replace(first, last, string) - замена символов с first по last
        //insert(position, string) - вставить строку в позицию

        StringBuilder message = new StringBuilder("Hello");
        message
                .append(", ")
                .append("World!");

        System.out.println(message.toString());
        message
                .replace(0, 5, "HELLO")
                .insert(0, "BIG ");
        System.out.println(message);

        // concatDoublesUsingString(); // 24330
        // concatDoublesUsingStringBuilder(); // 40
        System.out.println(fromEndToBeginning("Max", "Dima"));

        System.out.println(convert("ADNOVW"));
        System.out.println(wordRevers(description));

        System.out.println(formatIntArray(new int[] {1, 4, 5, -2}));

        // StringBuffer - это StringBuilder с поддержкой многопоточности
    }// MAIN

    public static String formatIntArray(int[] a) {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                builder.append(", ");
            }
                builder.append(a[i]);

        }
        builder.append("]");
        return builder.toString();
    }

    public static String wordRevers(String s) {
        StringBuilder builder = new StringBuilder();
        String[] array = s.split(" ");
        for (int i = (array.length - 1); i >= 0; i--) {
            builder.append(array[i]).append(" ");
        }
        return builder.toString();
    }

    public static void concatDoublesUsingString() {
        long before = System.currentTimeMillis();
        String r = "";
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            r += random.nextDouble();
        }
        long after = System.currentTimeMillis();
        System.out.println("time: " + (after - before));
    }

    public static void concatDoublesUsingStringBuilder() {
        long before = System.currentTimeMillis();
        StringBuilder r = new StringBuilder("");
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            r.append(random.nextDouble());
        }
        long after = System.currentTimeMillis();
        System.out.println("Result for StringBuilder: " + (after - before));
    }

    public static String fromEndToBeginning(String a, String b) {
        StringBuilder s = new StringBuilder();

        return s.append(a).append(" ").append(b).reverse().toString();
    }

    public static int dial(char c) {
        return switch (c) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> -1;
        };
    }

    public static String convert(String a) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            builder.append(dial(a.charAt(i)));
        }
        return builder.toString();
    }
}
