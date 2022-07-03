import java.util.Scanner;

public class finonacci {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        if (n != 0) {
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println(b);
        } else {
            System.out.println(0);;
        }
    }
}
