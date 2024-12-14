import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двоичное число и получите десятичное");
        int Numb = scanner.nextInt();
        int a = 0;
        int i = 0;
        while (Numb > 0) {
            int c = Numb % 10;
            a += c * Math.pow(2, i);
            Numb = Numb / 10;
            i++;
        }
        System.out.println(a);
    }
}