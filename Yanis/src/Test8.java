public class Test8 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 100");
        primes(2);
    }
    public static boolean prime(int number, int i) {
        if (number % i == 0){
            return false;
        }
        if (i == number - 1){
            return true;
        }
        return prime(number, i + 1);
    }

    public static void primes(int i) {
        if (prime(i, 2)){
            System.out.println(i);
        }
        if(i == 100){
            return;
        }
        primes(i + 1);
    }
}
