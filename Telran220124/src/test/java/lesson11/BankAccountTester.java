package lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTester {
    @Test
    public void testNotValidNumber(){
        Assertions.assertFalse(
                BankAccountValidator.isValidNumber(null));
        Assertions.assertFalse(
                BankAccountValidator.isValidNumber(""));
        Assertions.assertFalse(
                BankAccountValidator.isValidNumber("aaa"));
        Assertions.assertFalse(
                BankAccountValidator.isValidNumber("1234567890"));
        Assertions.assertFalse(
                BankAccountValidator.isValidNumber("1234567890abcd"));
        Assertions.assertFalse(
                BankAccountValidator.isValidNumber("00000000000000"));

    }

    @Test
    public void testValidNumber(){
        Assertions.assertTrue(
                BankAccountValidator.isValidNumber("12345678901234"));
        Assertions.assertTrue(
                BankAccountValidator.isValidNumber("11111111111111"));
    }
}
