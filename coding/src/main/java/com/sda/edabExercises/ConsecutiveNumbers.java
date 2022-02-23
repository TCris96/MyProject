import java.util.Arrays;
//Functia verifica daca vectorul primit este format din cifre consecutive
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8, 9, 9};
        System.out.println(areConsecutiveNumbers(array));

    }


    public static boolean areConsecutiveNumbers(int[] numbers) {
        boolean areConsecutiveNumbers = true;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1] + 1) {
                areConsecutiveNumbers = true;
            } else {
                areConsecutiveNumbers = false;
            }
        }
        if (areConsecutiveNumbers == true) {
            return true;
        }
        return false;
    }
}

