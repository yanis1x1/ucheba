import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер системы исчесления вашего числа"
                + " 1) Двоичная" +
                " 2) Троичная" +
                " 3) Десятичная");
        int a1 = scanner.nextInt();
        if (a1 == 3) { //Выбрали десятичную систему вводимого числа
            System.out.println("Выберите систему в котору перевести число" +
                    " 1)Двоичная" +
                    " 2)Троичная");
            int a2 = scanner.nextInt();
            if (a2 == 1) { //Выбрали двоичную систему выводимого числа
                System.out.println("Введите число");
                int number = scanner.nextInt();
                while (number > 0) {
                    int result = number % 2;
                    if (result == 0) {
                        System.out.print("0");
                    } else if (result != 0) {
                        System.out.print("1");
                    }
                    number = number / 2;
                }
            }
        }


        if (a1 == 1) { //Выбрали двоичную систему вводимого числа
            System.out.println("Выбирите систему в которую перевести " +
                    " 1)Десятичная" +
                    " 2)Троичная");
            int a3 = scanner.nextInt();
            if (a3 == 1) { //Выбрали десятичную систему выводимого числа
                System.out.println("Введите число");
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
        if (a1 == 2) { //выбрали троичную систему вводимого числа
            System.out.println("выберите систему в которую перевести" +
                    " 1)Двоичная" +
                    " 2)Десятичная");
            int a4 = scanner.nextInt();
            if (a4 == 2) { //Выбрали десятичную систему выводимого числа
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
    }
}