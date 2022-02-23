import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        if(address.startsWith("http://")){
            address=  address.replaceFirst("http://","https://");

        }
        System.out.println(address);

    }
}