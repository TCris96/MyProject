public class LetterS {
    public static void fullLine() {
        for (int i = 0; i < 7; i++) {
            System.out.print("# ");
        }
    }

    public static void nextLine(int blanck) {
        for (int i = 1; i <= 7; i++) {
            if (i == blanck) {
                System.out.print("# ");
            }
            System.out.print("  ");
        }
    }

    public static void main(String[] args) {
        fullLine();
        System.out.println();
        nextLine(2);
        System.out.println();
        nextLine(3);
        System.out.println();
        nextLine(4);
        System.out.println();
        nextLine(5);
        System.out.println();
        nextLine(6);
        System.out.println();
        fullLine();

    }
}
