public class PerfectSquarePath {
    public static void main(String[] args) {
        squarePatch(5);

    }
    public static void squarePatch(int x){
        int[][] squarePatch = new int[x][x];
        for(int i=0;i< squarePatch.length;i++){
            for(int j=0;j< squarePatch.length;j++){
                squarePatch[i][j]=x;
            }
        }
        for(int i=0;i< squarePatch.length;i++) {
            System.out.print("[");
            for (int j = 0; j < squarePatch.length; j++) {
                System.out.print(squarePatch[i][j]+" ,");

            }
            System.out.print("]");
            System.out.println();
            }
        }
}
