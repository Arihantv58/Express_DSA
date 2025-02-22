public class SearchSortedMatrix {
    private static int[] searchMatrix(int[][] matrix, int key){
        int row = 0;
        int col = matrix[0].length-1;
        int[] ans = new int[2];
        ans[0] = -1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
            else if(matrix[row][col] > key)
                col--;
            else
                row++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,50},
                          {32,33,39,50}};
        int key = 33;
        int[] ans = searchMatrix(matrix,key);
        if(ans[0] == -1)
            System.out.println("Key does not exist");
        else
            System.out.println("Key found at the position {"+ans[0]+","+ans[1]+"}");
    }
}
