import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();
        char[] letters=text.toCharArray();
        for(int i= letters.length-1;i>=0;i--){
            System.out.print(letters[i]);
        }
    }
}