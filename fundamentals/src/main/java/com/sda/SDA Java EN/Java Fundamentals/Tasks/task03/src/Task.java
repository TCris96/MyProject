import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double income = input.nextDouble();
        double tax = 0;
        if (income < 85528.00) {
            tax = income * 0.18 - 556.02;
            if(tax<=0){
                tax=0;
            }
        } else {
            tax = 14839.02 + (income - 85528.00) * 32 / 100;
        }
        System.out.println(tax);
    }
}