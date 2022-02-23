import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a x² + b x + c = 0");
        System.out.print("a=");
        int a = input.nextInt();
        if (a == 0) {
            System.out.println("Enter another value diffrent than 0");
            a = input.nextInt();
        }
        System.out.print("b=");
        int b = input.nextInt();
        System.out.print("c=");
        int c = input.nextInt();
        int d = b * b - 4 * a * c;
        if(d<0){
            System.out.println("The equations has no real solution");
        } else if(d==0){
            System.out.println("The equation has one real solution");
        } else{
            System.out.println("The equation has two distinct real solutions");
        }
    }
}
