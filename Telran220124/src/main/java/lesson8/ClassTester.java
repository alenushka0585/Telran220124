package lesson8;

import java.util.Arrays;

public class ClassTester {
    public static void main(String[] args) {
        Student max = new Student("Max Petrov", 19);
        Student alina = new Student("Alina Pavlova", 21);
       // Student pavel = new Student()
        alina.setAge(alina.getAge() + 2);
        System.out.println(alina.getAge());

        System.out.println("alina; " + alina);

        alina.incrementAge();
        System.out.println(alina);

        System.out.println(alina.getGender());
        System.out.println(max.getGender());

        Cat furry = new Cat("Пушок", 2, "рыжий");
        System.out.println(furry);

        Student [] group = {max, alina, new Student("Alex Malov", 20)};
        System.out.println(Arrays.toString(group));
        System.out.println("sumAges: " + sumAges(group));
    }

    public static int sumAges (Student [] s){
        int result = 0;
        for (int i = 0; i < s.length; i++) {
            result = result +s[i].getAge();
        }
        return result;
    }
}
