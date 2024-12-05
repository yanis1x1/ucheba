import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{

            System.out.println("Кубическое уравнение." +
                    "x^3+ax^2+bx+c=0");
            System.out.println("Введите а");
            double a = scanner.nextDouble();

            System.out.println("Введите b");
            double b = scanner.nextDouble();

            System.out.println("Введите c");
            double c = scanner.nextDouble();

            double Q = ((a * a) - (3 * b)) / 9;

            double R = (2 * Math.pow(a,3)) - (9 * a * b) + (27 * c) / 54;

            double S = Math.pow(Q,3) - Math.pow(R,3);

            double i = -1;

            System.out.println(" Q= " + Q + " R= " + R + " S= " + S  );

            if (S>0){
                double f = (1 / 3) * (Math.acos((Math.abs(R)) / Math.sqrt(Math.pow(Q,3))));


                double x1 = -2 * Math.sqrt(Q) * (Math.cos(f)) - (a / 3);

                double x2 = -2 * Math.sqrt(Q) * (Math.cos(f) + 2/3 * Math.PI) - (a / 3);

                double x3 = -2 * Math.sqrt(Q) * (Math.cos(f) - 2/3 * Math.PI) - (a / 3);

                System.out.println("Уравнение имеет три действительных корня " +
                        " x1= " + x1 + " x2= " + x2 + " x3= " + x3 + " f= " + f);

            }
            else if (S < 0){

                if (Q > 0){

                    double f = (1 / 3) * (Math.sinh(Math.abs(R) / Math.sqrt(Math.pow(Q,3))));

                    double x1 = -2 * Math.signum(R) * Math.sqrt(Q) * Math.cosh(f) - (a / 3);

                    double x2 = Math.signum(R) * Math.sqrt(Q) * Math.cosh(f) - (a / 3) + i * Math.sqrt(3) * Math.sqrt(Q) * Math.sinh(f);

                    double x3 = Math.signum(R) * Math.sqrt(Q) * Math.cosh(f) - (a / 3) - i * Math.sqrt(3) * Math.sqrt(Q) * Math.sinh(f);

                    System.out.println(" x1= " + x1 + " x2= " + x2 + " x3= " + x3 + "f" + f );
                }
                else if (Q<0){

                    double f = (1 / 3) * (Math.cosh(Math.abs(R) / Math.sqrt(Math.pow(Q,3))));

                    double x1 = -2 * Math.signum(R) * Math.sqrt(Q) * Math.sinh(f) - (a / 3);

                    double x2 = Math.signum(R) * Math.sqrt(Q) * Math.sinh(f) - (a / 3) + i * Math.sqrt(3) * Math.sqrt(Q) * Math.cosh(f);

                    double x3 = Math.signum(R) * Math.sqrt(Q) * Math.sinh(f) - (a / 3) - i * Math.sqrt(3) * Math.sqrt(Q) * Math.cosh(f);

                    System.out.println(" x1= " + x1 + " x2= " + x2 + " x3= " + x3 + "f" + f );
                    }
                else if (Q == 0);{
                   double x1 = Math.pow(c - Math.pow(a,3)/27,1/3) - (a/3);

                   double x2 = -((a + x1) / 2) + (i/2) * Math.sqrt( Math.abs((a-3*x1) * (a+x1) - (4*b)));

                    double x3 = -((a + x1) / 2) - (i/2) * Math.sqrt( Math.abs((a-3*x1) * (a+x1) - (4*b)));

                    System.out.println(" x1= " + x1 + " x2= " + x2 + " x3= " + x3);

                }

                }
            else if (S == 0){

                double x1 = -2 * Math.signum(R) * Math.sqrt(Q) - (a/3);

                double x2 = Math.signum(R) * Math.sqrt(Q) - (a/3);

                System.out.println(" x1= " + x1 + " x2= " + x2);
            }

            }

        }
    }

