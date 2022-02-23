import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// type here
        float number= scanner.nextFloat();
        System.out.println(Math.floor(number));
        System.out.println(Math.round(number));
        System.out.println(Math.ceil(number));
    }
}