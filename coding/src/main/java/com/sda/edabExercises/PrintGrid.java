public class PrintGrid {
     public static void main(String[] args) {
        printGrid(3,4);

    }

    public static void printGrid(int row, int column) {
        int[][] grid = new int[row][column];
        int k=1;
        for (int i = 0; i < grid[0].length; i++) {
            for(int j=0;j< grid.length;j++) {
                grid[j][i] = k;
                k++;
            }

        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }


    }
}
