import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //Programul cere utilizatorului sa introduca texte pana cand el introducete "Stop", apoi afiseaza
        //textul cu cea mai mare dimensiune. Textul cu cea mai mare dimensiune nu poate fi "stop".
        Scanner scanner = new Scanner(System.in);
        String text;
        String theLongestText = "";
        do {
            System.out.println("Enter a text");
            text = scanner.nextLine();
            if (text.length() > theLongestText.length() && !text.equalsIgnoreCase("stop")) {
                theLongestText = text;
            }
        } while (!text.equalsIgnoreCase("Stop"));
        System.out.println("The longest text inputed is: " + theLongestText);
    }
}
