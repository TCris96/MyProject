public class CrowdedCarriageCapacity {
    public static void main(String[] args) {

        System.out.println(findSeat(20, new int[]{3, 5, 4, 2}));
        int[] carriages = {50, 20, 80, 90, 100, 60, 30, 50, 80, 60};
        System.out.println(findSeat(1000, carriages));
        int[] carriages2 =  {35, 23, 40, 21, 38};
        System.out.println(findSeat(200,carriages2));

    }

    public static int findSeat(int capacity, int[] carriages) {
        int eachCarriagesCapacity = capacity / carriages.length;
        for (int i = 0; i < carriages.length; i++) {
            int procent = carriages[i] * 100 / eachCarriagesCapacity;
            if(procent<=50){
                return i;
            }
        }
        return -1;
    }
}
