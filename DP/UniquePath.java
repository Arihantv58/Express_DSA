package DP;

import java.util.Arrays;

public class UniquePath {
    public static int uniquePaths(int m, int n) {
        int[] firstRow = new int[n];
        Arrays.fill(firstRow, 1);

        for(int i=1; i<m; i++)
        {
            int[] currentRow = new int[n];
            Arrays.fill(currentRow, 1);
            for(int j=1; j<n; j++)
            {
                currentRow[j] = currentRow[j-1] + firstRow[j];
            }
            firstRow = currentRow;
        }
        return firstRow[n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
}
