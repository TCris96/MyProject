import java.util.Scanner;

public class Task12SpacesInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        int count=0;
        for(int i=0;i<text.length();i++) {
            if (text.charAt(i)==' ') {
                count++;
            }
        }
        System.out.println("There are "+count+" spaces");
        System.out.println("The percentage of occurrences of a space character is "+(100.0f*count/text.length())+" %");
    }
}
