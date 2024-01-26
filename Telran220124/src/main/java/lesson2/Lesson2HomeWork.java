package lesson2;

public class Lesson2HomeWork {
    public static void main(String[] args) {

//     1. Создать переменные всех примитивных типов и вывести их значения на экран

        boolean myBoolean = true;
        byte myByte = 105;
        short myShort = 10_555;
        int myInt = 555_666_777;
        long myLong = 1_112_223_334;
        float myFloat = 555.5f;
        double myDouble = 548.5;
        char myChar = 'z';

        System.out.println("Boolean: " + myBoolean);
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("__________________________________");

// 2. Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
// Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
// Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
// Отдельно выведите на экран сумму скидки от этой покупки.

        int priceA = 1_000;
        int priceB = 500;
        int discount = 100;
        int totalAmount = priceA + priceB - discount;

        System.out.println("Total amount is " + totalAmount);
        System.out.println("Discount is " + discount);
        System.out.println("__________________________________");

// 3. Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
// Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
// Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
// Распечатайте её через println. Сколько программа отбросила в дробной части?
        int int0 = 0;
        int int1 = 1;
        int int2 = 2;
        int int3 = 3;
        int int4 = 4;
        int int5 = 5;
        int int6 = 6;
        int int7 = 7;
        int int8 = 8;
        int int9 = 9;
        int intAverage = (int0 + int1 + int2 + int3 + int4 + int5 + int6 + int7 + int8 + int9) / 10;
        double doubleAverage = (double) (int0 + int1 + int2 + int3 + int4 + int5 + int6 + int7 + int8 + int9) / 10;

        System.out.println("Average is " + intAverage);
        System.out.println("Residual amount is " + (doubleAverage - intAverage));
        System.out.println("__________________________________");


// *4. Клиент положил в банк 1250 евро под 3.5 процента годовых.
// Создайте переменные нужных типов, вычислите и распечатайте на экране сумму,
// которая получится через 5 лет с учётом "сложных процентов".

        double depositInitialSum = 1_250;
        double percent = 0.035;
        double firstYearSumDeposit = depositInitialSum * percent + depositInitialSum;
        double secondYearSumDeposit = firstYearSumDeposit * percent + firstYearSumDeposit;
        double thirdYearSumDeposit = secondYearSumDeposit * percent + secondYearSumDeposit;
        double forthYearSumDeposit = thirdYearSumDeposit * percent + thirdYearSumDeposit;
        double fifthYearSumDeposit = forthYearSumDeposit * percent + forthYearSumDeposit;

        System.out.println("Total deposit is " + fifthYearSumDeposit);
        System.out.println("__________________________________");



// *5.  Дана целая переменная с трехзначным значением. Вывести на экран все цифры этого числа.
//Должно работать для произвольного трехзначного числа.
//Например, если значение равно 347, вывести на экран "первая: 3, вторая: 4, третья: 7"

        String number = "495";
        System.out.println("первая: " + number.charAt(0) + ", " + "вторая: " + number.charAt(1) + ", " +
                "третья: " + number.charAt(2));
        System.out.println("__________________________________");
    }
}
