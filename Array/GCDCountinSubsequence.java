package Array;

public class GCDCountinSubsequence {
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public static int countDifferentSubsequenceGCDs(int[] nums) {
        int maxVal = 0;
        // Determine the maximum element in nums.
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        
        // Create an array to record which numbers exist in nums.
        boolean[] exists = new boolean[maxVal + 1];
        for (int num : nums) {
            exists[num] = true;
        }
        
        int ans = 0;
        // For every candidate gcd i from 1 to maxVal.
        for (int i = 1; i <= maxVal; i++) {
            int g = 0;
            // Check every multiple of i up to maxVal.
            for (int j = i; j <= maxVal; j += i) {
                if (exists[j]) {
                    g = gcd(g, j);
                    // Early break if we've already reached candidate i.
                    if (g == i) {
                        break;
                    }
                }
            }
            // If the computed gcd equals i, then i is a valid gcd for some subsequence.
            if (g == i) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,15,40,5,6};
        System.out.println(countDifferentSubsequenceGCDs(arr));

    }
}
