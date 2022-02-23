public class SevenBoom {
    public static void main(String[] args) {
        int[] arrayOfNumbers ={2, 55, 60, 97, 86};
        System.out.println(findSeven(arrayOfNumbers));

    }
    public static String findSeven(int[] numbers){
        for(int i=0;i< numbers.length;i++){
            String word = String.valueOf(numbers[i]);
            if(word.contains("7")){
                return "Boom!";
            }
        }
        return "The array doesn't contain 7.";
    }
}
