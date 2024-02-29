package lesson11;

public class BankAccountValidator {
    public static boolean isValidNumber(String number){
        if (number == null || number.equals("")
        || number.equals("00000000000000") ||
        number.length() != 14) {
            return false;
        }
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
