import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tempInCelsius = input.nextFloat();
        float tempInFarhenheit = 1.8f * tempInCelsius+32.0f;
        System.out.println(tempInFarhenheit);
    }
}