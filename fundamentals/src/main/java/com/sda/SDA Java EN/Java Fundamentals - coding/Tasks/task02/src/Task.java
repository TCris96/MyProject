import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theNumber= scanner.nextInt();
        boolean result = true;
        if(theNumber>100){
            result=theNumber-100<=10;
        }else if(theNumber<100){
            result=100-theNumber<=10;
        }
        System.out.println(result);


    }
}