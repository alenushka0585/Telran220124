package lesson11;

public class Lesson11HomeWork {
    public static String getSecondWord(String s) {
        String[] result = s.split(" ");
        if (result.length - 1 < 1) {
            return null;
        }
        return result[1];
    }
}
