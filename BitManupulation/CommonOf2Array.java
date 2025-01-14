package BitManupulation;
import java.util.*;

public class CommonOf2Array {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] temp = new boolean[51];
        int[] ans = new int[n];
        int available = 0;

        for(int i=0; i<n; i++)
        {
            if(temp[A[i]])
                available++;
            else
                temp[A[i]] = true;
            
            if(temp[B[i]])
                available++;
            else
                temp[B[i]] = true;
            ans[i] = available;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of digits : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Enter first Array : ");
        for(int i=0; i<n; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter second Array : ");
        for(int i=0; i<n; i++)
        {
            B[i] = sc.nextInt();
        }

        int[] ans = findThePrefixCommonArray(A,B);
        
        System.out.println("The common count array is :");
        for(int i=0; i<n; i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
