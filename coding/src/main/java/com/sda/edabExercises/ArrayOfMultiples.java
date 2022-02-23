public class ArrayOfMultiples {
    public static void main(String[] args) {
        int[] array = multiplesArray(17,6);
        for (int i : array) {
            System.out.print(i+" ");
        }

    }
    public static int[] multiplesArray(int x, int length){
        int[] array = new int[length];
        for (int i =0;i< array.length;i++){
            array[i] =x * (i+1);
        }
        return array;
    }
}
