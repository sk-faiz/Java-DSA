import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong (int num) {
        int rev = num;
        int sum = 0;
        while (rev != 0) {
            int pop = rev % 10;
            rev /= 10;
            sum = sum + pop * pop * pop;
//            System.out.println(sum);
        }
        return sum == num;
    }
}
