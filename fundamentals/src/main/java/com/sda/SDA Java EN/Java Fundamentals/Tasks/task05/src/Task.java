import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usersNumber = input.nextInt();
        for (int i = 1; i <= usersNumber; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}