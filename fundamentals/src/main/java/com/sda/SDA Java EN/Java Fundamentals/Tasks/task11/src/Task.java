import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number<=1){
            System.out.println("I am interrupting work");
        } else {
            int counter=0;
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    counter++;
                }
            }if(counter==2){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }

    }
}