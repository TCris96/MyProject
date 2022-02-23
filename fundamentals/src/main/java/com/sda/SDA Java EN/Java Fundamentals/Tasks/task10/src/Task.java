import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theNumber= scanner.nextInt();
        for(int i=1;i<=theNumber;i++){
            if(theNumber%i==0){
                System.out.println(i);
            }
        }
    }
}