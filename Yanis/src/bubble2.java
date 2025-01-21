
import java.util.Scanner;

public class bubble2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Квадратное уравнение a^2 +b+c=0");
        System.out.println("Введите а");
        double a = scanner.nextDouble();
        System.out.println("Введите В");
        double b = scanner.nextDouble();
        System.out.println("Введите С");
        double c = scanner.nextDouble();
        double d = deskr(b, a, c);
        roots(a, b, d);

    }

    static double deskr(double b, double a, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    static void roots(double a, double b, double d) {
        if (d < 0) {
            System.out.println("Корней нет ");
        } else if (d == 0) {
            double x = -(b / (2 * a));
            System.out.println("1 корень " + x);
        } else {
            double x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("2 корня " + x1 + " " + x2);
        }
    }

}