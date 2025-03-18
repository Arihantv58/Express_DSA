package BitManupulation;

public class NiceSubarray {
    public static int longestNiceSubarray(int[] nums) {
        int i=0;
        int max = 0;
        int mask = 0;

        for(int j=0; j<nums.length; j++){
            while((mask & nums[j]) != 0){
                mask ^= nums[i];
                i++;
            }
            mask |= nums[j];
            max = Math.max(max, j-i+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,8,48,10};
        System.out.println(longestNiceSubarray(arr));
    }
}
