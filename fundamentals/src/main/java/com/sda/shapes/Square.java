public class Square {
    public static void fullLine(){
        for(int i=0;i<7;i++){
            System.out.print("# ");
        }
    }
    public static void drawLine(){
        System.out.print("#           #");
    }
    public static void main(String[] args) {
        fullLine();
        System.out.println();
        drawLine();
        System.out.println();
        drawLine();
        System.out.println();
        drawLine();
        System.out.println();
        drawLine();
        System.out.println();
        drawLine();
        System.out.println();
        fullLine();

    }
}
