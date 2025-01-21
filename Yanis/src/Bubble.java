import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        int[] array = new int[]{34, 4, 7, 23, 6};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int bubble = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = bubble;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}