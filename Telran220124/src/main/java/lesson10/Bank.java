package lesson10;

public class Bank {
    public static void main(String[] args) {
        LoanTaker max = new LoanTaker(24000, 57, "Max");
        LoanTaker alex = new LoanTaker(27000, 35, "Alex");
        LoanTaker sveta = new LoanTaker(34000, 28, "Sveta");

        LoanIssuer tom = new LoanIssuer("Tom", true, false);
        LoanIssuer alina = new LoanIssuer("Alina", false, true);

        System.out.println("Alina to Max " + alina.issue(max));
        System.out.println("Alina to Alex " + alina.issue(alex));
        System.out.println("Tom to Sveta " + tom.issue(sveta));
    }


}
