package lesson1;

public class Lesson1HomeWork {
    // Имя класса состоит из латинских букв цифр
    // Начинается с большой буквы
    // Без пробелов и знаков
    // TransportPlane - хорошо
    // railway - плохо
    // Secondproperty - плохо

    public static void main(String[] args) {

        System.out.println("My name is Yelena. " +
                "I live in Zweibrucken.");

        int initialMoney = 41;
        int numberOfKilos = 2;
        int priceOfApples = 3;
        int costOfLunch = 12;
        int priceOfCoffee = 3;
        int premium = 150;

        int total = initialMoney - priceOfCoffee - costOfLunch
                - (numberOfKilos * priceOfApples)  + premium;

        System.out.println("Total: " + total);
    }
}
