package Array;
import java.util.*;
public class leetcode1769
 {
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int currVal = 0;
        int currSum = 0;

        for(int i=0; i<n; i++)
        {
            ans[i] = currSum;
            currVal += boxes.charAt(i)=='1' ? 1 : 0;
            currSum += currVal;
        }

        currVal = 0;
        currSum = 0;
        for(int i=n-1; i>=0; i--)
        {
            ans[i] += currSum;
            currVal += boxes.charAt(i)=='1' ? 1 : 0;
            currSum += currVal;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] ans = minOperations(str);
        System.out.print("[ ");
        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]+ " ");
        }
        System.out.print("]");
        sc.close();
    }
}
