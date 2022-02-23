package com.sda.multidimensionalArray;

public class PopulateMultidimensionalArrayWithArraysByRow {
    public static void main(String[] args) {
        String[][] table = new String[2][];
        table[0]= new String[]{"Ana","has","cat"};
        table[1]= new String[]{"cat","is","black"};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }
}
