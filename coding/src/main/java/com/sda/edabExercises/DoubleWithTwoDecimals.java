import java.text.DecimalFormat;

public class DoubleWithTwoDecimals {
    public static void main(String[] args) {
        int[] numbers ={3, 3, 3, 3, 3};
        Double average = calculateTheAverage(numbers);
        System.out.println(average);

    }
    public static double calculateTheAverage(int[] numbers){
        int sum=0;
        for (int number : numbers) {
            sum += number;
        }
        DecimalFormat twoDecimals = new DecimalFormat("#.##");
        double average = (double) sum / numbers.length;
        return Double.valueOf(twoDecimals.format(average));
    }
}
