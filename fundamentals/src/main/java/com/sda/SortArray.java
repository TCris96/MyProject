import java.util.Scanner;

public class ReadArray {
    public static void main(String[] args) {
        int[] array = readLength();
        int[] sortArray = sortArray(array);
        readArray(sortArray);

    }

    public static int[] readLength() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int number = input.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number " + (i + 1));
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static int[] sortArray(int[] reverseNumbers) {
        int[] numbers = new int[reverseNumbers.length];
        for (int i = 0, j = numbers.length - 1; i < reverseNumbers.length; i++, j--) {
            numbers[j] = reverseNumbers[i];
        }
        return numbers;
    }

    public static void readArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
