package DP;

public class QuestionsBrainpower {
    public static long mostPoints(int[][] q) {
        int n = q.length;
        if(n==1){
            return q[0][0];
        }

        long[] dp = new long[200001];
        for(int i=n-1; i>=0; i--){
            dp[i] = Math.max((q[i][0] + dp[i+ q[i][1] + 1]), dp[i+1]);
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int[][] q = {{3,2}, {4,3}, {4,4}, {2,5}};
        System.out.println(mostPoints(q));
    }
}
