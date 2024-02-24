package lesson10.extention.additional;

public class AdditionalHomeWork {
//    Напишите функцию, преобразующую шестнадцатеричное число в двоичное
//    public static String hexToBinary(String hex)
//
//    Пример: "abc" -> "1010 1011 1100"

    public static String hexToBinary(String hex){
        StringBuilder builder = new StringBuilder();
        String array[] = hex.split("");
        for (int i = 0; i < array.length; i++) {
            builder.append(hexadecimal(array[i])).append(" ");
        }
        return builder.toString();
    }

    public static String hexadecimal(String s){
        return switch (s) {
            case "0" -> "0000";
            case "1" -> "0001";
            case "2" -> "0010";
            case "3" -> "0011";
            case "4" -> "0100";
            case "5" -> "0101";
            case "6" -> "0110";
            case "7" -> "0111";
            case "8" -> "1000";
            case "9" -> "1001";
            case "a" -> "1010";
            case "b" -> "1011";
            case "c" -> "1100";
            case "d" -> "1101";
            case "e" -> "1110";
            case "f" -> "1111";
            default -> "no such number";
        };
    }

    public static void main(String[] args) {
        System.out.println("abc to binary is: " + hexToBinary("abc"));

        System.out.println("_______________________________________________");

        System.out.println("1/6 + 1/3 = " + Fraction.plus(new Fraction(1,6),
                new Fraction(1,3)));
        System.out.println("1/6 - 1/3 = " + Fraction.minus(new Fraction(1,6),
                new Fraction(1,3)));
        System.out.println("1/6 * 1/3 = " + Fraction.multiply(new Fraction(1,6),
                new Fraction(1,3)));

        System.out.println("1/6 / 1/3 = " + Fraction.divide(new Fraction(1,6),
                new Fraction(1,3)));

    }
}
