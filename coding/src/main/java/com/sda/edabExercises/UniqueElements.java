public class UniqueElements {
    public static void main(String[] args) {
        int[] array1 ={2};
        int[] array2 ={3,3,3,3,3};
        System.out.println(isTheSameNumberOfUniqueElements(array1,array2));

    }

    public static boolean isTheSameNumberOfUniqueElements(int[] array1, int[] array2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] != array1[i + 1]) {
                count1++;
            } else {
                continue;
            }
        }
        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] != array2[i + 1]) {
                count2++;
            } else {
                continue;
            }
        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }
}
