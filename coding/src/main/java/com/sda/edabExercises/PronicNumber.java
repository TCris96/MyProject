public class PronicNumber {
    public static void main(String[] args) {
        System.out.println(isAPronicNumber(111));

    }
    public static boolean isAPronicNumber(int n){
        for(int i=0;i<Integer.MAX_VALUE;i++){
            if( i*(i+1) == n){
                return true;
            }else if(i*(i+1)>n){
                return false;
            }
        }
        return false;
    }
}
