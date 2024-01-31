package lesson3;

public class StringTester {
    public static void main(String[] args) {
        String firstName = "Max";
        int age = 27;
        char copyright = '\u00A9'; // list of Unicode in Wikipedia
        char space = ' ';
        String max = firstName + space + age + space +copyright;
        System.out.println(max);

        char t = '\t'; //табуляция
        char n = '\n'; //перевод строки

        String s = "London is the capital of Great Britain";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0, 6));
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf("Great"));
        System.out.println(s.indexOf("i", 25));
        System.out.println(s.replace("capital", "biggest city"));

        System.out.println(s.replace("Britain", "BRITAIN"));
        System.out.println(s.replaceAll("i", "I"));
        System.out.println(s.lastIndexOf(" "));
        System.out.println(s.indexOf("Paris")); // индекс -1 означает, что нет такой строки



    }
}
