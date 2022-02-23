import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.replaceAll("[^a-zA-Z ]", " ");
        String[] words = text.toLowerCase(Locale.ROOT).split(" ");
        Arrays.sort(words);
        for (int i = 0; i < words.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {

                if (words[j].equals(words[i])) {
                    count++;
                }
            }
            System.out.println(words[i] + "-" + count);

        }
    }
}

