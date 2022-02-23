public class ArrayRecursiv {
    public static void main(String[] args) {
        int[] table = new int[4];
        int[] populatedArray = populate(table,0);
        for(int x:table){
            System.out.print(x+" ");
        }
    }

    public static int[] populate(int[] vector,int i){
        if(vector.length==i){
            return vector;
        } else {
            vector[i] = i + 1;
            return populate(vector,i+1);

        }

    }
}
