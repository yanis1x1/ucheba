import java.util.Scanner;

public class Zadachi {
    public static void main(String[] args) {//Выводит индексы сумма элементов равная определенному числу
        int []arrey= new int []{2,7,11,15};
        int target =9;
        for (int i=0;i< arrey.length - 1;i++){
            for(int j =0; j<arrey.length+1;j++){
                if (arrey[i]+arrey[j]==target){
                    System.out.println(arrey[i]);
                    System.out.println(arrey[j]);
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}