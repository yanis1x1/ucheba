import java.util.Arrays;

public class MassRek {
    public static void main(String[] args) {
        System.out.println("Создание метода который умножает эллементы массива на 2");
        int[] arr = new int[]{1, 2, 56, 87, 9};
        arr = reks(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reks(int[] array, int i) {
        if (i == array.length) {
            return array;
        }
        array[i] = array[i] * 2;
        return reks(array,i + 1);
    }
}

