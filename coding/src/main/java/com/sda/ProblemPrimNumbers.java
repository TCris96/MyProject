//Dandu-se un numar n de la tastatura, sa se afiseze toate numerele prime

import java.util.Scanner;

public class ProblemPrimNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("The numbers ");
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print( i + " ");
            }
        }
        System.out.print(" are prim numbers");
    }
}
