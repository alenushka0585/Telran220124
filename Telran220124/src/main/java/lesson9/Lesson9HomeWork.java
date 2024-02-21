package lesson9;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson9HomeWork {
//    1. Напишите функцию которая возвращает строку из первых букв передаваемой в нее фразы
//    Пример: "Однажды в студеную зимнюю пору" -> "Овсзп"

    public static String getFirstLetters(String s) {
        StringBuilder builder = new StringBuilder();
        String[] tempo = s.split(" ");
        for (int i = 0; i < tempo.length; i++) {
            builder.append(tempo[i].charAt(0));
        }
        return builder.toString();
    }

//   2.  Напишите функцию, которая подсчитывает количество определенных символов в
//   передаваемой в нее строке.
//            Например:
//            "London is a capital", 'o' -> 2 (подсчитываем число букв o)
//            "London is a capital", ' ' -> 3 (подсчитываем число пробелов)
//            "London is a capital", 'a' -> 3  (подсчитываем число букв a)

    public static int getAmountOfSymbols(String s, char c) {
        int lengthBefore = s.length();
        String[] result = s.split(Character.toString(c));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            builder.append(result[i]);
        }
        int lengthAfter = builder.length();
        return lengthBefore - lengthAfter;
    }

//    3. Напишите функцию, которая формирует sql запрос в виде строки из передаваемых
//    в нее двух массивов строк.
//    public static String formatSql(String [] params, String [] vals)
//    В первом массиве названия параметров, во втором значения соответствующих параметров,
//    размер массивов params и vals всегда будет одинаков.
//    Значения из массива vals равные null не должны использоваться при формировании запроса
//
//    Например - параметры active и year не используются так как их значения null:
//    String [] params = {"id", "city", "year", "active", "climate"};
//    String [] vals = {"1", "Helsinki", null, null, "cool"};
//    "SELECT * FROM users WHERE id = '1' AND city = 'Helsinki' AND climate = 'cool';"
//
//    Еще пример - пераметр year не используется так как его значения null:
//    String [] params = {"country", "year", "active"};
//    String [] vals = {"Germany",  null, "true"};
//    "SELECT * FROM users WHERE country = 'Germany' and active='true';"

    public static String formatSql(String[] params, String[] vals) {
        StringBuilder builder = new StringBuilder("\"SELECT * FROM users WHERE ");
        for (int i = 0; i < params.length; i++) {
            if (vals[i] != null && i < params.length - 1) {
                builder
                        .append(params[i])
                        .append(" = '")
                        .append(vals[i])
                        .append("' AND ");
            } else if (vals[i] != null && i == params.length - 1) {
                builder
                        .append(params[i])
                        .append(" = '")
                        .append(vals[i])
                        .append("';\"");
            }
        }
        return builder.toString();
    }

//    4. Функция принимает на вход три одномерных массива и возвращает массив
//    из максимумов "троек" элементов, имеющих одинаковый индекс
//    Пример: {1,2,3}, {2,3,4}, {-10, 5, 0} -> {2,5,4}

    public static int [] arrayWithMaxNumbers (int []a, int []b, int [] c){
        int [] result = new int[a.length];
        int currentMax;
        for (int i = 0; i < a.length; i++) {
            currentMax = a[i] > b[i]? a[i]: b[i];
            currentMax = currentMax > c[i]? currentMax:c[i];
            result[i] = currentMax;
        }
        return result;
    }

//    5. Напишите функцию, переводящую строку из шестнадцатеричных цифр в целое десятичное число.
//    Пример: "1abc" -> 6844  (1*16 3 + 10*16 2 + 11*16 1 + 12 * 16 0)  4096 + 2560 + 176 + 12

//            "a0" -> 160
//
//    шестнадцатеричные цифры это
//    0123456789abcdef
//    'a' это 10, 'f' это 15 и тп
//
//    На всякий случай конвертер - https://www.rapidtables.com/convert/number/hex-to-decimal.html

    public static int converterFromHexadecimalToDecimal(String s) {
        StringBuilder builder = new StringBuilder();
        int result = 0;
        int count = s.length() - 1;
        int currentNumer;
        String array[] = s.split("");
        for (int i = 0; i < array.length; i++) {
            currentNumer = hexadecimal(array[i]);
            int sixteen = 1;
            for (int j = 0; j < count; j++) {
                sixteen = sixteen * 16;
            }
            count--;
            currentNumer = currentNumer * sixteen;
            result = result +currentNumer;
        }
        return result;
    }

    public static int hexadecimal(String s){
        return switch (s) {
            case "0" -> 0;
            case "1" -> 1;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "a" -> 10;
            case "b" -> 11;
            case "c" -> 12;
            case "d" -> 13;
            case "e" -> 14;
            case "f" -> 15;
            default -> -1;
        };
    }

//
//    6. Напишите функцию, удаляющую элемент из перердаваемого в нее массива целых
//    public static int [] delete(int [] a, int position)
//    Пример: {1,2,3,4,5}, 2 -> {1,2,4,5} // второй элемент отсутствует в возвращаемом новом массиве

    public static int [] delete(int [] a, int position){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i != position){
                builder.append(a[i]);
            }
        }
        int [] resalt = new int[builder.length()];
        for (int i = 0; i < resalt.length; i++) {
            resalt[i] = Character.getNumericValue(builder.charAt(i));
        }
        return resalt;
    }

    public static void main(String[] args) {
        System.out.println("1 task: _____________________________________________________________");
        String firstLetters = "Однажды в студеную зимнюю пору";
        System.out.println("First letters from \"Однажды в студеную зимнюю пору\" are: " + getFirstLetters(firstLetters));

        System.out.println("2 task: _____________________________________________________________");
        System.out.println("The amount of symbols \'o\' in the sentence \"London is a capital\" is: "
                + getAmountOfSymbols("London is a capital", 'o'));
        System.out.println("The amount of symbols \' \' in the sentence \"London is a capital\" is: "
                + getAmountOfSymbols("London is a capital", ' '));
        System.out.println("The amount of symbols \'a\' in the sentence \"London is a capital\" is: "
                + getAmountOfSymbols("London is a capital", 'a'));

        System.out.println("3 task: _____________________________________________________________");
        String[] params = {"id", "city", "year", "active", "climate"};
        String[] vals = {"1", "Helsinki", null, null, "cool"};
        System.out.println(formatSql(params, vals));

        String[] params2 = {"country", "year", "active"};
        String[] vals2 = {"Germany", null, "true"};
        System.out.println(formatSql(params2, vals2));

        System.out.println("4 task: _____________________________________________________________");
        int [] first = {1,2,3};
        int [] second = {2,3,4};
        int [] third = {-10, 5, 0};
        System.out.println("Max numbers of arrays {1,2,3}, {2,3,4}, {-10, 5, 0} are: "
                + Arrays.toString(arrayWithMaxNumbers(first,second,third)));

        System.out.println("5 task: _____________________________________________________________");
        System.out.println("Convert from \"1abc\" is: " + converterFromHexadecimalToDecimal("1abc"));
        System.out.println("Convert from \"a0\" is: " + converterFromHexadecimalToDecimal("a0"));

        System.out.println("6 task: _____________________________________________________________");
        int [] array = new int[] {1,2,3,4,5};
        System.out.println("Array {1,2,3,4,5} without number on 2 position: " + Arrays.toString(delete(array, 2)));
    }
}
