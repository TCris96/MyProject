import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;
        int count10=0;
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]==1){
                count1++;
            } else if(numbers[i]==2){
                count2++;
            } else if(numbers[i]==3){
                count3++;
            } else if(numbers[i]==4){
                count4++;
            }else if(numbers[i]==5){
                count5++;
            } else if(numbers[i]==6){
                count6++;
            } else if(numbers[i]==7){
                count7++;
            } else if(numbers[i]==8){
                count8++;
            } else if(numbers[i]==9){
                count9++;
            }else if(numbers[i]==10){
                count10++;
            }
        }
        System.out.println("1-"+count1);
        System.out.println("2-"+count2);
        System.out.println("3-"+count3);
        System.out.println("4-"+count4);
        System.out.println("5-"+count5);
        System.out.println("6-"+count6);
        System.out.println("7-"+count7);
        System.out.println("8-"+count8);
        System.out.println("9-"+count9);
        System.out.println("10-"+count10);


    }
}