import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и проверьте делится ли это число на число от 0 до 100");
        int a = scanner.nextInt();
        int i = 1;
        for (; i <= 100; i++) {
            System.out.println(i);
            if (a % i == 0) {
                System.out.println("+Делится на число " + a);
            }
            else if (a%i!=0){
                System.out.println( "-Не делится на число " +a);
            }
        }
    }
}