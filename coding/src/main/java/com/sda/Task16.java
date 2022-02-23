import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        int maxLength = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;

            } else {
                if(maxLength<count){
                    maxLength=count;
                }
                count = 0;
            }
        }
        System.out.println("Maximum subsequence is: " + maxLength);
    }
}
