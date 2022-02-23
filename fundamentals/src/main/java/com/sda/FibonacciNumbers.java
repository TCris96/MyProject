import java.util.ArrayList;

public class FibonacciNumbers {
    public static void findTheNumber(int x) {
        if (x == 0) {
            System.out.println(0);
        } else if (x == 1) {
            System.out.println(1);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            list.add(1);
            for (int i = 3; i <= x; i++) {

                list.add(list.get(i - 1) + list.get(i - 2));
            }
            System.out.println(list.toString());
            System.out.println("The number from "+x+" position is "+list.get(x));
        }

    }

    public static void main(String[] args) {
        //Fiecare număr Fibonacci este suma celor două numere Fibonacci anterioare, rezultând secvența:
        //
        // 0,1,1,2,3,5,8,13,21,34,55
        findTheNumber(5);
        findTheNumber(6);
        findTheNumber(7);

    }
}