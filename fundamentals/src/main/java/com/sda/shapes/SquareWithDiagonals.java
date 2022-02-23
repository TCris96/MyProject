public class SquareWithDiagonals {
    public static void fullLine() {
        for (int i = 1; i <= 7; i++) {
            System.out.print("#  ");
        }
    }

    public static void drawLine(int x, int y) {
        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                System.out.print("# ");
            }
            if (i == 7) {
                System.out.print("# ");
            }
            if (i == x) {
                System.out.print("# ");
            }
            if (i == y) {
                System.out.print("# ");
            }
            System.out.print("  ");
        }
    }

    public static void nextLine(int blank) {
        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                System.out.print("# ");
            }

            if (i == blank) {
                System.out.print(" # ");
            }
            if (i == 7) {
                System.out.print(" #");
            }
            System.out.print("  ");
        }
    }

    public static void main(String[] args) {
        fullLine();
        System.out.println();
        drawLine(2, 6);
        System.out.println();
        drawLine(3, 5);
        System.out.println();
        nextLine(4);
        System.out.println();
        drawLine(3, 5);
        System.out.println();
        drawLine(2, 6);
        System.out.println();
        fullLine();

    }
}
