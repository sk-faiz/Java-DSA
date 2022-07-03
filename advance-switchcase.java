import java.util.Scanner;

public class switchCae {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        String inName = name.next();

        switch (inName) {
            case "faiz" -> System.out.println("Your name is faiz");
            case  "aditya" -> System.out.println("Your name is Aditya");
            default -> System.out.println("aditya");
        }
    }
}
