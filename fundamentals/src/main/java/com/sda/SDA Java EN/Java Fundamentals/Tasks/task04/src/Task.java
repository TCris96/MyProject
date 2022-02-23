import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        int numberOdInstallments = input.nextInt();
        if (amount < 100.00 || amount > 10000.00) {
            amount = 5000.00;
        }
        if (numberOdInstallments < 6 || numberOdInstallments > 48) {
            numberOdInstallments = 36;
        }
        double interest;
        if (numberOdInstallments <= 6 || numberOdInstallments <= 12) {
            interest = 2.5;
        } else if (numberOdInstallments <= 13 || numberOdInstallments <= 24) {
            interest = 5.0;
        } else {
            interest = 10.0;
        }
        double monthlyInstallment = (amount + (interest * amount/100)) / numberOdInstallments;
        System.out.println(monthlyInstallment);
    }
}