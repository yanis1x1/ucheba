import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и получите двоичное");
        int number = scanner.nextInt();
        while (number > 0) {
            int result = number % 3;
            if (result == 0) {
                System.out.println("0");
            } else if (result != 0) {
                System.out.println("");
                
            }
            number = number / 3;
        }
    }
}