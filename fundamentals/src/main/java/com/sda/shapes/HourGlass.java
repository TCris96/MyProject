public class HourGlass {
    public static void fullLine(){
        for(int i=0;i<7;i++){
            System.out.print("# ");
        }
    }
    public static void nextLine(int blank){
        for(int i=1;i<=7;i++){
            if(i==blank){
                System.out.print("# ");
            }
            System.out.print("  ");
        }
    }
    public static void doubleLine(int x, int y){
        for(int i=1;i<=7;i++){
            if (i == x) {
                System.out.print("#");
            } else if(i==y){
                System.out.print("#");
            }
            System.out.print("  ");
        }
    }
    public static void main(String[] args) {
        fullLine();
        System.out.println();
        doubleLine(2,6);
        System.out.println();
        doubleLine(3,5);
        System.out.println();
        nextLine(4);
        System.out.println();
        doubleLine(3,5);
        System.out.println();
        doubleLine(2,6);
        System.out.println();
        fullLine();

    }
}
