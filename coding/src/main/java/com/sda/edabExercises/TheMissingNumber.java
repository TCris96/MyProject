import java.util.Arrays;

public class TheMissingNumber {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {7, 2, 3, 6, 5, 10, 1, 4, 8};
        int theMissingNumber = findTheMissingNumber(arrayOfNumbers);
        if (theMissingNumber == 0) {
            System.out.println("Invalid array of numbers.");
        } else {
            System.out.println("The missing number is " + theMissingNumber);
        }

    }

    public static int findTheMissingNumber(int[] arrayOfNumbers) {
        if (arrayOfNumbers.length == 9) {
            Arrays.sort(arrayOfNumbers);
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                if (arrayOfNumbers[i] != (i+1) ) {
                    return i+1;
                }
            }
            return 10;
        }
        return 0;
    }
}
