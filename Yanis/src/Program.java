import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и определите простое или составное");
        int i = scanner.nextInt();
        int n = 1;
        boolean isPrime = true;
        while (n < i - 1 && isPrime) {
            n++;
            if (i % n == 0) {
                System.out.println("Число состовное");
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Число простое");
        }
    }
}



