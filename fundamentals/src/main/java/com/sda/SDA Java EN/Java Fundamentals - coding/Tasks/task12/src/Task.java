import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String replaceText= "[bleep]";
        if(text.contains("cheese and rice")) {
            text = text.replaceAll("cheese and rice", replaceText);
        }
        if(text.contains("chuck it")){
            text = text.replaceAll("chuck it", replaceText);
        }
        if(text.contains("motherpuffin")){
            text = text.replaceAll("motherpuffin",replaceText);
        }
        System.out.println(text);

    }
}