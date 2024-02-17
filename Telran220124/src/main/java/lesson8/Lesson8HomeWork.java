package lesson8;

import java.util.Arrays;
import java.util.SortedMap;

public class Lesson8HomeWork {
//    1.Напишите функцию которая вернет минимальное значение из переданного в нее массива целых
//    {1,5,7,4,-2} -> -2

    public static int min(int[] a) {
        Arrays.sort(a);
        return a[0];
    }

//    2. Напишите функцию, которая вернет второе по величине значение из передаваемого в нее массива целых
//    public static int getSecondLargest(int a[])
//    Например: {1,5,7,4,-2} -> 5
//    Возможно, предварительная сортировка как-то поможет?

    public static int getSecondLargest(int a[]) {
        Arrays.sort(a);
        return a[a.length - 2];
    }

//    3. Напишите функцию, распечатывающую только имена из передаваемого в нее массива студентов

    public static void getStudentsNames(Student[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName());
        }
    }

//    4. Напишите функцию, которая вернет сумму минимума и максимума из передаваемого в нее массива целых:
//    {2,1,6,9} -> 10

    public static int maxAndMinSum(int[] a) {
        Arrays.sort(a);
        return a[0] + a[a.length - 1];
    }

//    5. На основе функции, сортирующей "пузырьком" массив целых, напишите функцию,
//    которая отсортирует передаваемый в нее массив студентов по возрасту.

    public static void sortByAge(Student[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1].getAge() > a[j].getAge()) {
                    Student temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
//    6. Найдите среднее среди всех элементов массива double

    public static double middleNumber(double[] a) {
        Arrays.sort(a);
        return a[a.length / 2];
    }

//    7. Написать функцию, находящую общие элементы у двух массивов
//    {1,2,3} {2,12,18,1} -> {1,2}

    public static int[] identicalNumber(int[] a, int[] b) {
        String number = "";
        if (a.length <= b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        number = number + a[i];
                    }
                }
            }
        } else {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (b[i] == a[j]) {
                        number = number + b[i];
                    }
                }
            }
        }
        int[] result = new int[number.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(number.substring(i, i + 1));
        }
        return result;
    }
//
//    8. Написать функцию, проверяющую правильность расстановки скобок -
//    открывающая скобка должна сопровождаться закрывающей
//    "(())" → true
//    "(1+(2-(4-3)))" → true
//    "(((test)" → false
//    ")("  → false

    public static boolean checkBrackets(String s) {
        char right = '(';
        char left = ')';
        int firstRight = s.indexOf(right);
        int firstLeft = s.indexOf(left);
        int countRight = s.length() - s.replace(String.valueOf(right), "").length();
        int countLeft = s.length() - s.replace(String.valueOf(left), "").length();

        if (countRight == countLeft && firstRight < firstLeft) {
            return true;
        }
        return false;
    }

//    9. Напишите функцию, вставляющую элемент в массив на определенную позицию -
//    static int [] insert(int [] a, int index, int number)
//    {1,2,3}, 0, 10 -> {10,1,2,3}

    static int[] insert(int[] a, int index, int number) {
        int[] result = new int[a.length + 1];
        result[index] = number;
        int safe = 0;
        for (int i = 0; i < a.length; i++) {
            safe = a[i];
            if (i < index) {
                result[i] = safe;
            } else if (i == index) {
                result[i + 1] = safe;
            } else {
                result[i + 1] = safe;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] firstArray = {1, 5, 7, 4, -2};
        System.out.println("1 task ______________________________________________________________");
        System.out.println("Min number is: " + min(firstArray));

        System.out.println("2 task ______________________________________________________________");
        System.out.println("Second large number is: " + getSecondLargest(firstArray));

        Student[] group = {new Student("Max", 22), new Student("Alina", 20), new Student("Masha", 23)};
        System.out.println("3 task ______________________________________________________________");
        System.out.println("Students names are: ");
        getStudentsNames(group);

        int[] secondArray = {2, 1, 6, 9};
        System.out.println("4 task ______________________________________________________________");
        System.out.println("Sum of min and max numbers is: " + maxAndMinSum(secondArray));

        System.out.println("5 task ______________________________________________________________");
        System.out.println("Students before sorting: " + Arrays.toString(group));
        sortByAge(group);
        System.out.println("Students after sorting: " + Arrays.toString(group));

        double[] first = {12.5, 10.2, 9.9, 15.1, 17.8};
        System.out.println("6 task ______________________________________________________________");
        System.out.println("Middle number is: " + middleNumber(first));

        int[] forthArray = {1, 2, 3};
        int[] fifthArray = {2, 12, 18, 1};
        System.out.println("7 task ______________________________________________________________");
        System.out.println("Identical numbers are: " + Arrays.toString(identicalNumber(fifthArray, forthArray)));

        System.out.println("8 task ______________________________________________________________");
        System.out.println("(()) " + checkBrackets("(())"));
        System.out.println("(1+(2-(4-3))) " + checkBrackets("(1+(2-(4-3)))"));
        System.out.println("(((test) " + checkBrackets("(((test)"));
        System.out.println(")( " + checkBrackets(")("));

        int[] thirdArray = {1, 2, 3};
        System.out.println("9 task ______________________________________________________________");
        System.out.println("Array before insert: " + Arrays.toString(thirdArray));
        System.out.println("Array after insert: " + Arrays.toString(insert(thirdArray, 0, 10)));
    }
}

