import java.util.Locale;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text=text.replaceAll(" ","");
        char[] letters = text.replaceAll("[^a-zA-Z ]", "").toLowerCase(Locale.ROOT).toCharArray();
//        for(char x:letters){
//            System.out.print(x+" ");
//        }
        char[] reversedLetters = new char[letters.length];
        for (int i = 0,j= letters.length-1; i < letters.length; i++,j--) {

            reversedLetters[i] = letters[j];

        }
        boolean palindrome = true;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != reversedLetters[i]) {
                palindrome=false;
            }

        }
        System.out.println(palindrome);


    }
}