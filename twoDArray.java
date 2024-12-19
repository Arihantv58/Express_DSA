import java.util.Arrays;
public class twoDArray {
    public static void sortByRow(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            Arrays.sort(arr[i]);
        }
    }

    public static void sortByColumn(int arr[][], int col)
    {
       Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col]));
    }

    public static void display(int [][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void completeSort(int[][] arr)
    {
        int r =arr.length;
        int c= arr[0].length;
        int[] temp= new int[r*c];
        int k;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                     temp[c*i+j]=arr[i][j];
            }
        }

        Arrays.sort(temp);
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                arr[i][j]= temp[c*i+j];
            }
        }

    }

    public static void main(String[] args) {
        int [][] arr = {{3,8,5,4,2,6},{8,4,6,2,9,5},{5,3,2,1,6,7}};
        display(arr);
        // sortByRow(arr);
        // display(arr);
        // sortByColumn(arr, 2);
        // display(arr);
        completeSort(arr);
        display(arr);
    }
}
