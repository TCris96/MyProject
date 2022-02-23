public class SumOfTheArray {
    public static void main(String[] args) {
        System.out.println( sumOfTheArray(2));
    }

    public static int sumOfTheArray( int length) {
        if (length == 0) {
            return 0;
        } else if (length == 1) {
            return 1;
        } else {

                return length + sumOfTheArray( length - 1);

            }
        }

    }

