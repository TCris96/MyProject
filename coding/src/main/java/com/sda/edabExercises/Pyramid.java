public class Pyramid {
    public static void main(String[] args) {
        printThePyramid(3);

    }
    public static void printLines(){
        for(int i=0;i<4;i++){
            System.out.print("/");
        }
    }
    public static void printReverseLines(){
        for(int i=0;i<4;i++){
            System.out.print("\\");
        }
    }
    public static void printStars(){
        for(int i=0;i<8;i++){
            System.out.print("*");
        }
    }
    public static void printThePyramid(int x){
        int temp = x;
        int limit = 8 * (x-1);
        if(x>=2) {
            while(temp>1){
                printLines();
                temp--;
            }
            temp=x;
            while(temp>1){
                printReverseLines();
                temp--;
            }
            temp = x;
            System.out.println();
            if(limit/2 >4){


            }
            while(temp>1){
                printStars();
                temp--;
            }
            temp =x;

        }else{
            System.out.println("Invalid number");
        }
    }
}
