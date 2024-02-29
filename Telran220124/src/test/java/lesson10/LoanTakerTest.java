package lesson10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanTakerTest {
    @Test
    public void issueTest() {
        LoanTaker t1 = new LoanTaker(21000, 50, "Peter");
        LoanTaker t2 = new LoanTaker(27000, 30, "Ivan");
        LoanTaker t3 = new LoanTaker(33000, 40, "Anna");
        LoanTaker t4 = new LoanTaker(19000, 65, "Maria");

        LoanIssuer a1 = new LoanIssuer("Alina", true, true);
        LoanIssuer a2 = new LoanIssuer("Max", false, true);
        LoanIssuer a3 = new LoanIssuer("Nik", false, false);

        Assertions.assertTrue(
                a1.issue(t1)
        );
        Assertions.assertTrue(
                a2.issue(t2)
        );
        Assertions.assertTrue(
                a3.issue(t3)
        );

        Assertions.assertFalse(
                a1.issue(t4)
        );
        Assertions.assertFalse(
                a2.issue(t4)
        );
        Assertions.assertFalse(
                a3.issue(t4)
        );
    }
}
