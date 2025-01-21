import java.util.Arrays;
import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заполните элементы массива");
        System.out.println("0 элемент");
        int a = scanner.nextInt();
        System.out.println("1 элемент");
        int b = scanner.nextInt();
        System.out.println("2 элемент");
        int c = scanner.nextInt();
        System.out.println("3 элемент");
        int d = scanner.nextInt();
        System.out.println("4 элемент");
        int e = scanner.nextInt();
        System.out.println("5 элемент");
        int f = scanner.nextInt();
        int sum = 0;
        int[] massif = new int[]{a, b, c, d, e, f};
        System.out.println("Выберите действие с массивом");
        System.out.println("1)Колличесво всех элементов");
        System.out.println("2)Сумма всех элементов");
        System.out.println("3)Вывести все элементы");
        System.out.println("4)Развернуть массив");
        System.out.println("5)Показать выбранный элемент");
        System.out.println("6)Показать первый и последний элемент");
        int vbr = scanner.nextInt();

        if (vbr == 1) { // 1)Колличество вспех элементов.
            System.out.println(massif.length);
        } else if (vbr == 2) { // 2)Сумма всех элементов.
            for (int i = 0; i < massif.length; i++) {
                sum = sum + massif[i];
            }
            System.out.println(sum);
        } else if (vbr == 3) { // 3)Вывести все элементы
            System.out.println(Arrays.toString(massif));
        } else if (vbr == 4) {//4) Развернуть массив
            for (int i : massif) {
            }
            for (int i = massif.length - 1; i >= 0; i--) {
                System.out.println(massif[i]);
            }
        } else if (vbr == 5) { //Показывыает выбранный элемент
            System.out.println("Введите номер элемента");
            int eln = scanner.nextInt();
            System.out.println(massif[eln]);
        } else if (vbr == 6) { //Первый и последний элемент
            System.out.println(massif[0] +" и " + massif[6]);
        }
    }
}



