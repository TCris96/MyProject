import java.util.Scanner;

public class Task2BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms:");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height in centimeters:");
        int height = scanner.nextInt();
        float newHeight = (float) height / 100.0f;
        float bmi = weight / (newHeight * newHeight);
        System.out.println(bmi);
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }

    }
}
