package lesson10.extention.additional;

public class Fraction {
    //    Напишите класс Fraction для представления натуральных дробей
//    У дроби есть целые числитель (numerator) и знаменатель (denominator)
//    Например, у дроби 1/3 числитель это 1 и знаменатель 3
//    Добавьте конструктор, toString, геттеры и сеттеры
//    Добавьте в класс операции для сложения, умножения, деления и вычитания дробей
//    Постарайтесь сделать так, чтобы получающаяся дробь в результате упрощалась.
//
//    Например, 1/6 + 1/3 = 1/2
//
//    class Fraction {
//        public Fraction plus(Fraction f)
//        public Fraction minus(Fraction f)
//        public Fraction multiply(Fraction f)
//        public Fraction divide(Fraction f)
//    }
    private int numerator;
    private int denominator;

    public Fraction() {

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction plus(Fraction f1, Fraction f2) {
        Fraction result = getGeneralDenominator(f1,f2);
        result.numerator = f1.numerator + f2.numerator;
        result.fractionSimplifier();

        return result;
    }

    public static Fraction minus(Fraction f1, Fraction f2) {
        Fraction result = getGeneralDenominator(f1,f2);
        result.numerator = f1.numerator - f2.numerator;
        result.fractionSimplifier();
        return result;
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.numerator = f1.numerator * f2.numerator;
        result.denominator = f1.denominator * f2.denominator;
        result.fractionSimplifier();

        return result;
    }

    public static Fraction divide(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        result.numerator = f1.numerator * f2.denominator;
        result.denominator = f1.denominator * f2.numerator;
        result.fractionSimplifier();

        return result;
    }

    public void fractionSimplifier() {
        if (numerator < 0){
            numerator = numerator * -1;
            for (int i = numerator; i > 1; i--) {
                if (denominator % i == 0 && numerator % i == 0) {
                    denominator = denominator / i;
                    numerator = numerator / i;
                }
            }
            numerator = numerator * -1;
        }
        for (int i = numerator; i > 1; i--) {
            if (denominator % i == 0 && numerator % i == 0) {
                denominator = denominator / i;
                numerator = numerator / i;
            }
        }
    }

    public static Fraction getGeneralDenominator(Fraction f1, Fraction f2){
        Fraction result = new Fraction();
        result.denominator = f1.denominator * f2.denominator;
        f1.numerator = result.denominator / f1.denominator * f1.numerator;
        f2.numerator = result.denominator / f2.denominator * f2.numerator;
        return result;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
