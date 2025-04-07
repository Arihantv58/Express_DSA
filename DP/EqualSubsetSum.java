package DP;

public class EqualSubsetSum {
    public static Boolean canPartition(Boolean[] memo, int s, int index, int[] nums) {
        if (s == 0)
            return true;

        if (s < 0)
            return false;
       
        if (index == 0)
            return s == nums[0];
       
        if (memo[s] != null)
            return memo[s];
       
        return memo[s] = canPartition(memo, s - nums[index], index - 1, nums) || canPartition(memo, s, index - 1, nums);
    }

    public static boolean canPartition(int[] nums) {

        int s = 0;

        for (int i = 0; i < nums.length; i++)
            s += nums[i];

        if (s % 2 != 0)
            return false;

        int n = nums.length;

        s /= 2;

        Boolean[] memo = new Boolean[s + 1];

        return canPartition(memo, s, n - 1, nums);
    }

    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
    }
}
