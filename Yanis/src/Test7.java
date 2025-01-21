import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("Вывести половину элементов массивва");
        int[] array = new int[8];
        half(array,0);
    }
    static void half (int[] arr, int i){
        if (i== arr.length/2){
            return;
        }
        System.out.println(arr[i]);
        half(arr,i+1);
    }
}
