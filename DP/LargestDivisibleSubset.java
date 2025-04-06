package DP;

import java.util.*;

public class LargestDivisibleSubset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] prev = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int maxIdx = 0;

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i] % nums[j] == 0 && dp[i] < dp[j]+1){
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if(dp[i] > dp[maxIdx]){
                maxIdx = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        while(maxIdx >= 0){
            result.add(nums[maxIdx]);
            maxIdx = prev[maxIdx];
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,8,15,32,64};
        System.out.println(largestDivisibleSubset(nums));
    }
}
