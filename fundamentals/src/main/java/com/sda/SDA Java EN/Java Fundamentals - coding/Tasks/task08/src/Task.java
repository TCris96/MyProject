import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        if(number==0){
            System.out.println(0);
        }else if(number>0){
            for(int i=number;i>=0;i--){
                System.out.print(i+" ");
            }
        } else if(number<0){
            for(int i=number;i<=0;i++){
                System.out.print(i+" ");
            }
        }


    }
}