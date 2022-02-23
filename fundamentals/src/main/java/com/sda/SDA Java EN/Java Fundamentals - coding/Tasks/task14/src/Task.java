import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int a = 0;
        int b = 0;
        if (number1 > number2) {
            a = number1;
            b = number2;
        } else {
            a = number2;
            b = number1;
        }
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);


    }
}