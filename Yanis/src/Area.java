import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите номер фигуры и узнайте ее площадь.");
        System.out.println("1)Треугольник 2)Квадрат 3) Прямоуголник 4)Трапеция 5)Паралелипипед");
        double figure = scanner.nextDouble();
        if (figure == 1) { //1
            System.out.println("Введите высоту треугольника");
            double h = scanner.nextDouble();
            System.out.println("Введите длину стороны треугольника");
            double a = scanner.nextDouble();
            triangle(a, h);
        } else if (figure == 2) { //2
            System.out.println("Введите сторону квадрата");
            double a1 = scanner.nextDouble();
            square(a1);
        } else if (figure == 3) { //3
            System.out.println("Введите длину");
            double a2 = scanner.nextDouble();
            System.out.println("Введите ширину");
            double b1 = scanner.nextDouble();
            rectangle(a2,b1);
        } else if (figure == 4) { //4
            System.out.println("Введите 1 длину");
            double a3 = scanner.nextDouble();
            System.out.println("Введите 2 длину");
            double b2 = scanner.nextDouble();
            System.out.println("Введите высоту");
            double h1 = scanner.nextDouble();
            trapeze(a3, b2, h1);
        } else { //5
            System.out.println("Введите ширину");
            double a4 = scanner.nextDouble();
            System.out.println("Введите длинну");
            double b3 = scanner.nextDouble();
            System.out.println("Введите высоту");
            double h2 = scanner.nextDouble();
            parallelepiped(a4,b3,h2);
        }
    }

    static double triangle(double a, double h) { //1
        double s = (a * h) / 2;
        System.out.println(s);
        return s;
    }

    static double square(double a1) { //2
        double s1 = Math.pow(a1, 2);
        System.out.println(s1);
        return s1;
    }

    static double rectangle(double a2, double b1) { //3
        double s2 = a2 * b1;
        System.out.println(s2);
        return s2;
    }

    static double trapeze(double a3, double b2, double h1) { //4
        double s3 = 0.5 * ((a3 + b2) * h1);
        System.out.println(s3);
        return s3;
    }

    static double parallelepiped(double a4, double b3, double h2) { //5
        double s4 = 2 * ((a4 * b3) + (a4 * h2) + (b3 * h2));
        System.out.println(s4);
        return s4;
    }
}
