import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float distance = scanner.nextFloat();
        float kmDistance= (float) (distance*1.6);
        System.out.println(kmDistance);


    }
}