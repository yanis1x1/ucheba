public class rekursia {
    public static void main(String[] args) {
        System.out.println("Вывод чисел от 1 до 50 и от 100 до 150");
        System.out.println(rek(0));
    }

    static int rek(int i) {
        if (i > 50 && i < 100) {
            return rek(i + 1);
        }
        if (i == 150) {
            return i;
        }
        System.out.println(i);
        return (rek(i + 1));
    }
}