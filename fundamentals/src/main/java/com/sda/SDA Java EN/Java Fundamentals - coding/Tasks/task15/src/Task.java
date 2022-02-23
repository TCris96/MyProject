import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 >= 0 && number2 >= 0) {
            if (number1 > number2) {
                System.out.println(Math.floorMod(number1,number2));

            } else{
                System.out.println(Math.floorMod(number2,number1));
            }

        }


    }
}