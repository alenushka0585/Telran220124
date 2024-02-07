package lesson5;

public class SwitchTest {
    public static void main(String[] args) {
        int dayOfWeek = 3; // 1 - понедельник, 2 - вторник и т.д.
        // если пн-пт -> рабочий день
        // суббота -> суббота
        // воскресенье -> воскресенье

        switch (dayOfWeek) { // любой примитивный тип + String
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("рабочий день");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("такого дня нет");
                break;
        }

        System.out.println(getDayOfWeek("пятница"));
        System.out.println(getSeasonName(12));

        System.out.println(convert(55, 'R'));;
    }

    public static int getDayOfWeek (String d){
        switch (d){
            case "понедельник":
                return 1;
            case "вторник":
                return 2;
            case "среда":
                return 3;
            case "четверг":
                return 4;
            case "пятница":
                return 5;
            case "суббота":
                return 6;
            case "воскресенье":
                return 7;
            default:
                return 0;
        }
    }
    public static int getDayOfWeek2 (String d) {
        return switch (d) {
            case "понедельник" -> 1;
            case "вторник" -> 2;
            case "среда" -> 3;
            case "четверг" -> 4;
            case "пятница" -> 5;
            case "суббота" -> 6;
            case "воскресенье" -> 7;
            default -> 0;
        };
    }

    public static String getSeasonName (int month){
      return switch (month){
            case 1,2,12 -> "зима";
            case 3,4,5-> "весна";
            case 6,7,8 -> "лето";
            case 9,10,11-> "осень";

            default -> "нет такого сезона";
        };
    }

    public static double convert(double sum, char currency) {

        return switch (currency) {
            case 'R' -> sum * 98.28;
            case 'D' -> sum * 1.08;
            case 'Y' -> sum * 159.88;
            case 'G' -> sum * 0.85;
            default -> 0;
        };
    }
}
