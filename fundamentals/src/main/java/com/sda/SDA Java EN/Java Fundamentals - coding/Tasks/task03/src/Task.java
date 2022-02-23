import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if(number1>0&&number2>0) {
            System.out.println(true);
        }else if(number1<0&&number2<0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


    }
}
