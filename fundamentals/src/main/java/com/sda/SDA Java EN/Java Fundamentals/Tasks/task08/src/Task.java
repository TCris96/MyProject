import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=0;
        int sum = 0;
         do{
            number=input.nextInt();
            sum += number;
        }while (number != 0);
        System.out.println(sum);


    }
}