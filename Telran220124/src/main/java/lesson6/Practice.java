package lesson6;

public class Practice {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        String result = dayOfWeek > 5 ? "выходной" : "рабочий";

        System.out.println(result);

        System.out.println(positiveAndDividedBy3(9));
    }

    public static boolean positiveAndDividedBy3(int a) {
//        if (a >= 0 && a % 3 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return a >= 0 && a % 3 == 0;
    }


}
