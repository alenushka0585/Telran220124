package lesson8;

public class VariablesStringsPractice {
    public static void main(String[] args) {
        int age = 34; // объявление и инициализация
        age = 35; // изменение значения
        age = -age;

        String name = null; // объявление
        System.out.println("name: " + name);

        String city = "Mexico City";
        System.out.println("Mexico City length: " + city.length());
        System.out.println("first letter of Mexico City: " + city.charAt(0));
      //  System.out.println("30 symbol of Mexico City: " + city.charAt(30));
        System.out.println("from 4 to last symbol: " + city.substring(7));
        System.out.println("from 2 to 4 symbol: " + city.substring(2,4));

        String size = "Big";
        String animal = "Cat";
        int id = 3;

        String bigAnimal = size + " " + animal +" " + id;
        System.out.println("bigAnimal: " + bigAnimal);

        System.out.println(city.indexOf("i"));
        System.out.println(city.lastIndexOf("i"));

        String sentence = "Однажды в студеную зимнюю пору";
        int firstSpace = sentence.indexOf(" ");
        int secondSpace = sentence.indexOf(" ", firstSpace + 1);
        int thirdSpace = sentence.indexOf(" ", secondSpace + 1);
        String word = sentence.substring(secondSpace +1, thirdSpace);
        System.out.println("word: " + word);

        System.out.println(sentence.replaceAll("зимнюю", "летнюю"));

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);

        sentence = sentence.toLowerCase();
        System.out.println(sentence);

        String max = "max";
        String anotherMax = "MAX".toLowerCase();

        System.out.println("max: " + max + " anotherMax: " + anotherMax);
        System.out.println(max == anotherMax); // проверяет на объект
        System.out.println(max.equals(anotherMax)); // проверяет содержимое
    }
}
