import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        int prime = integer.nextInt();
        System.out.println(isPrime(prime));
    }
    static boolean isPrime (int num) {
        if (num <= 1 ) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c >num;
    }
}
