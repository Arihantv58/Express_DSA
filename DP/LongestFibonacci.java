package DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestFibonacci {
    public static int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int[][] dp = new int[n][n];

        for(int i=0; i<n; i++)
            Arrays.fill(dp[i],2);

        for(int i=0; i<n; i++)
            mp.put(arr[i], i);

        int max_length = 0;

        for(int j=1; j<n; j++){
            for(int k=j+1; k<n; k++){
                int target = arr[k] - arr[j];
                if(mp.containsKey(target) && mp.get(target)<j){
                    int i = mp.get(target);
                    dp[j][k] = dp[i][j] + 1;
                }
                max_length = Math.max(max_length, dp[j][k]);
            }
        }
        return max_length >=3 ? max_length : 0;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubseq(arr));
    }
}
