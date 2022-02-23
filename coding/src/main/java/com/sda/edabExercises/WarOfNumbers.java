public class WarOfNumbers {
    public static void main(String[] args) {
        int[] array = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        int result=warOfNumbers(array);
        System.out.println(result);

    }
    public static int warOfNumbers(int[] numbers){
        int evenNumbersSum=0;
        int oddNumbersSum=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                evenNumbersSum+=numbers[i];
            } else{
                oddNumbersSum+=numbers[i];
            }
        }
        int result=0;
        if(evenNumbersSum>oddNumbersSum){
            result=evenNumbersSum-oddNumbersSum;
        } else{
            result=oddNumbersSum-evenNumbersSum;
        }
        return result;
    }
}
