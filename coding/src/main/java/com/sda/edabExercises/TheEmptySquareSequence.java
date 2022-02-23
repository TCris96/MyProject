import java.util.Scanner;

public class TheEmptySquareSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = findTheNumberOfEmptySquare(input.nextInt());
        System.out.println("The square has "+result+" empty squares.");

    }
    public static int findTheNumberOfEmptySquare(int step){
        int[][] square = new int[step][step];
        int count=0;
        for (int i = 0; i < square.length; i++) {
            for(int j=0;j<square.length;j++){
                if(i != j){
                    count ++;
                }
            }
        }
        return count * 4;
    }
}
