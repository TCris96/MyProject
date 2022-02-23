import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = input.nextInt();
        int countEquals = 0;
        if (number1 <= 0 || number2 <= 0 || number3 <= 0) {
            System.out.println("You can't enter a negative number. Try again!");
        }
        else if (number1 > 50 || number2 > 50 || number3 > 50) {
            System.out.println("The numbers must be between 1 and 50. Try again!");
        }
        else if (number1 == number2 || number2 == number3 || number1 == number3) {
            System.out.println("You can't enter a number twice. Enter another number");
        } else {
            Random random = new Random();
            int[] inputNumbers = {number1, number2, number3};
            int[] winningNumbers = new int[3];
            for (int i = 0; i < winningNumbers.length; i++) {
                winningNumbers[i] = random.nextInt(50);
            }
            System.out.print("The lucky numbers are:");
            for (int number : winningNumbers) {
                System.out.print(number + " ");
            }
            System.out.println();
            ArrayList<Integer> numbersList = new ArrayList(Arrays.asList(winningNumbers));
            for (int luckyNumber : inputNumbers) {
                if (numbersList.contains(luckyNumber)) {
                    countEquals++;
                    numbersList.remove(luckyNumber);
                }

            }
            if (countEquals == 0) {
                System.out.println("You won nothing. Good luck next time!");
            } else if (countEquals == 1) {
                System.out.println("You won 100 ron.");
            } else if (countEquals == 2) {
                System.out.println("You won 200 ron.");
            } else if (countEquals == 3) {
                System.out.println("Congratulations! You won 300 ron.");
            }
        }
    }
}