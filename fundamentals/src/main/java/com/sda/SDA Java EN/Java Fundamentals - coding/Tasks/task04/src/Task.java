import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int maxJars = 42;
        int minJars = 1;
        if (amount >= 1 && amount <= 42) {
            if (amount <= 12) {
                System.out.println(true);
            } else {
                if (amount % 7 == 0) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        } else {
            System.out.println(false);
        }


    }
}