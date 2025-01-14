package Array;
import java.util.*;

public class Ways_to_splitArray {
    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int count = 0;
        long total = 0;
        for(int i=0; i<n; i++)
        {
            total+=nums[i];
        }
        
        long currSum = 0;
        for(int i=0; i<n-1; i++)
        {
            currSum += nums[i];
            if(currSum >= total-currSum)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(waysToSplitArray(nums));
        sc.close();
    }
}
