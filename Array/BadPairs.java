package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BadPairs {
    public static long countBadPairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
            nums[i] = nums[i]-i;
        map.put(nums[0],1);
        long count = 0;
        for(int i=1; i<n ;i++)
        {
            int occured = map.getOrDefault(nums[i],0);
            count += i - occured;
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = sc.nextInt();
        System.out.println("Bad Pairs : "+countBadPairs(nums));
        sc.close();
    }
}
