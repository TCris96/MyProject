public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println(reverseTheNumber(-122157));
        System.out.println(reverseTheNumberAsInteger(589));

    }

    public static String reverseTheNumber(int n) {
        String newNumber = "";
        if (n < 0) {
            n = (-1) * n;
        }
        if (n == 0) {
            return "Try another number grater than 0.";
        } else {
            while (n > 0) {
                newNumber = newNumber + (n % 10);
                n = n / 10;
            }
        }
        return newNumber;
    }

    public static int reverseTheNumberAsInteger(int n) {
        if (n < 0) {
            n = (-1) * n;
        }
        if (n == 0) {
            return 0;
        }
        int newNumber = 0;
        while (n > 0) {
            newNumber = Integer.valueOf(String.valueOf(newNumber) + String.valueOf(n % 10));
            n = n / 10;
        }
        return newNumber;
    }
}
