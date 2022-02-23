import java.util.Scanner;

public class Task13Stutter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        for(int i=0;i< words.length;i++){
            System.out.print(words[i]+" "+words[i]+" ");
        }
    }
}
