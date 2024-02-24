package lesson10;

public class JapaneseEmployee {
    private String name;
    private double baseSalary;
    private int years;

    public JapaneseEmployee(String name, double baseSalary, int years) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double calculateSalary() {
        return years * 50_000 + baseSalary;
    }

    public static double calculateBudget(JapaneseEmployee[] e) {
        double sum = 0;
        for (int i = 0; i < e.length; i++) {
            sum += e[i].calculateSalary();
        }
        return sum;
    }

    public void greeting() {
        if (years > 15) {
            System.out.println("Здравствуйте, уважаемый " + getName());
        } else {
            System.out.println("Привет, " + getName());
        }
    }

    @Override // переопределение метода из родительского класса
    public String toString() {
        return name + ", " + years;
    }

    public static void main(String[] args) {
        JapaneseEmployee e1 = new JapaneseEmployee("Akura Kurosava",
                200_000, 12);

        JapaneseEmployee e2 = new JapaneseEmployee("Matsuo Basyo",
                100_000, 20);
        JapaneseEmployee e3 = new JapaneseEmployee("Okyo Yamaguchi",
                150_000, 5);

        System.out.println("e1 " + e1.calculateSalary());
        System.out.println("e2 " + e2.calculateSalary());

        JapaneseEmployee[] employees = {e1, e2, e3};
        System.out.println(calculateBudget(employees));

        e1.greeting();
        e2.greeting();
        e3.greeting();
        System.out.println(e3);
    }
}
