package lesson6;

public class BreakContinueTester {
    public static void main(String[] args) {
        for (int d = 1; d <= 5; d++) // 1 2 3 4 5
        {
            if(d == 2){
                continue; // перейти к следующей итерации
            }
            if (d == 5){
                break; // прекратить выполнение цикла
            }
            for (int e = 1; e <= d; e++) {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println("______________");
        
    }
}
