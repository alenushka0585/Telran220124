package lesson5;

public class DebugTest {
    public static void main(String[] args) {
  boolean result = isEven(15);
        System.out.println(result);
    }

    public static int modulo(int i){
        int result = i%2;
        return result;
    }

    public static boolean isEven (int num){
        if (modulo(num) == 0){
            System.out.println("num " + num + " is even");
            return true;
        } else {
            System.out.println("num " + num + " is odd");
            return false;
        }
    }
}
