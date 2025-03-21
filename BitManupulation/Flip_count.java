package BitManupulation;

public class Flip_count {
    public static int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flip = 0;
        int flipCountCurr = 0;
        
        for(int i=0; i<n; i++){

            if(i >= k && nums[i-k] == 2)
                flipCountCurr--;
                
            if(flipCountCurr%2 == nums[i]){
                if(i+k > n)
                    return -1;
                flip++;
                flipCountCurr++;
                nums[i] = 2;
            }
        }
        return flip;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,0,1,0,1,1,0};
        System.out.println(minKBitFlips(nums, 3));
    }
}
