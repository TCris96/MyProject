public class AddingStrings {
    public static void main(String[] args) {
        System.out.println(add("5","5"));
    }

    public static String add(String number1, String number2){
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        int sum = n1 + n2;
        return String.valueOf(sum);
    }
}
