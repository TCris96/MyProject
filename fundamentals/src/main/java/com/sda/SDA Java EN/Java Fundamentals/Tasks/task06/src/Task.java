import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;

            }
            System.out.println(sum);
        }else{
                System.out.println("Job completed");
            }


    }
}