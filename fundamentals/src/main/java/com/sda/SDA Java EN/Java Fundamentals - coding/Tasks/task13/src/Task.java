import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = new int[5];
        for (int i = 0; i < firstArray.length; i++) {

            firstArray[i] = scanner.nextInt();
        }
        int[] secondArray = new int[5];
        for (int i = 0; i < secondArray.length; i++) {

            secondArray[i] = scanner.nextInt();
        }
        for(int i=0;i< firstArray.length;i++){
            for(int j=0;j< secondArray.length;j++){
                if(firstArray[i]==secondArray[j]){
                    System.out.println(firstArray[i]);
                }
            }
        }


    }
}