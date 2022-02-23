import java.util.Locale;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if(text.length()<3){
            text=text.toUpperCase(Locale.ROOT);
            System.out.println(text);
        } else{
            String temporarText = text.substring(text.length()-3);
            String tempTextFromBegginig = text.substring(0,text.length()-3);
            temporarText=temporarText.toUpperCase(Locale.ROOT);
            System.out.print(tempTextFromBegginig+temporarText);
        }

    }
}