import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        int sum = 0;

        while (n / 10 != 0) {
            sum += n % 10;
            n = n / 10;

        }
        sum += n;
        System.out.println("The sum is: " + sum);
    }
}
