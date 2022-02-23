public class Task {

    public static void main(String[] args) {
        System.out.println(calculateAverage(1, 4, 2, 5, 6, 8, 11));
        System.out.println(calculateAverage(1, 5, -11, 192));
        System.out.println(calculateAverage(1));
        System.out.println(calculateAverage(1, 1, 1));
    }

    public static float calculateAverage(int... numbers) {
        int sum = 0;
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            count++;
        }
        return (float) sum/count;
    }
}