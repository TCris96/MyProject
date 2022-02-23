public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isAPerfectNumber(97));

    }
    public static boolean isAPerfectNumber(int x){
        int sum=0;
        for(int i=1;i<x;i++){
            if(x % i ==0){
                sum+=i;
            }
        }
        if(sum == x){
            return true;
        }
        return false;
    }
}
