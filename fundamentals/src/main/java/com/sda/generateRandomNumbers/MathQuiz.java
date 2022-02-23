import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int minim = 300;
        int maxim = 2000;
        int coef = maxim - minim + 1;
        int number1 = (int) (Math.random() * coef + minim);
        int number2 = (int) (Math.random() * coef + minim);
        System.out.println("What is the sum between " + number1 + " and " + number2 + " ?");
        int userResult = input.nextInt();
        int result = number1 + number2;
        if (userResult == result) {
            score += 1;
            System.out.println("Your answer is right.");
        } else{
            System.out.println("Your answer is wrong.");
        }
        number1 = (int) (Math.random() * coef + minim);
         number2 = (int) (Math.random() * coef + minim);
        System.out.println("What is the subtraction between " + number1 + " and " + number2 + " ?");
        userResult = input.nextInt();
        result = number1 - number2;
        if (userResult == result) {
            score += 1;
            System.out.println("Your answer is right.");
        } else{
            System.out.println("Your answer is wrong.");
        }
        System.out.println("Your score is: " + score);
    }
}
