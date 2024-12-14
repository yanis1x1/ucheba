import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа и он покажет простые между ними");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i < b; i++) {
            int n = 1;
            boolean isPrime = true;
            while (n < i - 1 && isPrime) {
                n++;
                if (i % n == 0) {
                    System.out.println("Число состовное " + i);
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Число простое " + i);
            }
        }
    }
}