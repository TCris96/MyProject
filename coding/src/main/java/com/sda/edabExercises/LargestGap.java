import java.util.Arrays;

public class LargestGap {
    public static void main(String[] args) {
        int[] array ={9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        System.out.println("The largest gap is "+largestGap(array));

    }
    public static int largestGap(int[] array){
        int counter=0;
        int theBigestCounter=0;
        Arrays.sort(array);
        for(int i=0;i< array.length-1;i++){
            for(int j=array[i];j<array[i+1];j++){
                counter++;
            }
            if(counter>theBigestCounter){
                theBigestCounter = counter;
                counter = 0;
            } else{
                counter=0;
            }
        }
        return theBigestCounter;
    }
}
