public class TheBiggestNumberDivisibleBy5And7 {
    public static void main(String[] args) {
        int biggestNumber = 0;
        for (int i = 1; i <= 10000; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                biggestNumber = i;
            }
        }
        System.out.println(biggestNumber);
    }
}
