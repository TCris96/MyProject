public class MagicDate {
    public static void main(String[] args) {
        System.out.println(isAMagicDate("6 2 2012"));

    }
    public static boolean isAMagicDate(String date){
        String[] words = date.split(" ");
        int m = Integer.parseInt(words[0]);
        int d = Integer.parseInt(words[1]);
        String lastChar = words[2].substring(words[2].length()-1);
        int lastNumberFromTheYear = Integer.parseInt(lastChar);
        String numberOfTwo = words[2].substring(words[2].length()-2);
        int decimalNumberFromTheYear = Integer.parseInt(numberOfTwo);
        String numberOfThree = words[2].substring(1);
        int numberOdThreeDigit = Integer.parseInt(numberOfThree);
        int result = m * d;
        if(result == lastNumberFromTheYear){
            return true;
        }
        if(result == decimalNumberFromTheYear){
            return true;
        }
        if(result == numberOdThreeDigit){
            return true;
        }
        return false;
    }
}
