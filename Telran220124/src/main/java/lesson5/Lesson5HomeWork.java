package lesson5;

public class Lesson5HomeWork {
//  1. Напишите с помощью switch функцию, которая принимает на вход название валюты
//  и возвращает ее международный код.
//  Для японской йены, английского фунта, доллара сша, евро и монгольского тугрика.
//  Коды валют посмотрите в интернет. Например: "евро" -> "EUR"

    public static String currencyCode(String currency) {
        return switch (currency) {
            case "японская йена" -> "JPY";
            case "английский фунт" -> "GBP";
            case "доллар сша" -> "USD";
            case "евро" -> "EUR";
            case "монгольскй тугрик" -> "MNT";
            default -> "нет такой валюты";
        };
    }

//  2. Напишите функцию, которая реализует выбор цифры при нажатии на буквы
//  на телефонном номеронаберателе. Функция должна принимать на вход символ
//  и возвращать целое число. Буквам 'A','B','C' соответствует цифра 2,
//  буквам 'D','E','F' соответствует 3,
//  GHI 4,
//  JKL 5 ,
//  MNO 6 ,
//  PQRS 7 ,
//  TUV 8 ,
//  WXYZ 9 .
//  Пример: 'P' -> 7

    public static int whichNumber(char c) {
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

//  3. Напишите функцию которая принимает на вход трехзначное целое число
//  и возвращает самую большу цифру. Например: 382->8

    public static int biggestNumber(int x) {
        int a = x / 100;
        int b = (x - a * 100) / 10;
        int c = x - a * 100 - b * 10;
        if (a > b && a > c) {
            return a;
        }else if (b>a && b>c){
            return b;
        }else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(currencyCode("доллар сша"));
        System.out.println(currencyCode("японская йена"));
        System.out.println(currencyCode("английский фунт"));

        System.out.println(whichNumber('P'));

        System.out.println(biggestNumber(355));
    }
}
