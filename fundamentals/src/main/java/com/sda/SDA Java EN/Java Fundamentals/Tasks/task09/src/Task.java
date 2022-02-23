import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int number=1;
        while (number != 0) {
            number = scanner.nextInt();

            if (number>maxNumber){
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;

            }
        }
        System.out.println(maxNumber+minNumber);
        System.out.println((maxNumber+minNumber)/2.0);

    }
}