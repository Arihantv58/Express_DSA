public class SearchTwoDArray {

    public static int[] linearSearch(int[][] arr, int key)
    {
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<(arr[0].length);j++)
            {
                if(key == arr[i][j])
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }

    public static int[] twoDBinarySearch(int[][] arr, int target)
    {
        int low =0;
        int high= arr.length-1;
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        while(low<=high)
        {
            int mid = high-(high-low)/2;
            if(target==arr[mid][0])
            {
                ans[0]=mid;
                ans[1]=0;
                return ans;
            }
            else if(target>arr[mid][0])
            {
                int temp = arr[mid].length-1;
                if(target==arr[mid][temp])
                {
                    ans[0]=mid;
                    ans[1]=temp;
                    return ans;
                }
                else if(target>arr[mid][temp])
                {
                    low = mid+1;
                }
                else if(target<arr[mid][temp])
                {
                    ans[0] =mid;
                    ans[1]= binarySearch(arr, target, mid);
                    return ans;
                }
            }
            else if(target<arr[mid][0])
            {
                high=mid-1;
            }
        }
        return ans;
    }

    public static int binarySearch(int[][] arr, int target, int mid)
    {
        int n= arr[mid].length-1;
        int res=0;
        int low =0;
        int high = n;
        while(low<=high)
        {
            int tempMid = high-(high-low)/2;
            if(target==arr[mid][tempMid])
            {
                res = tempMid;
                return res;
            }
            else if(target>arr[mid][tempMid])
            {
                low = tempMid+1;
            }
            else if(target<arr[mid][tempMid])
            {
                high = tempMid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int key=15;
        int[] ans = new int[2];
        //ans= linearSearch(arr, key);
        ans=twoDBinarySearch(arr,key);
        if(ans[0]==-1 || ans[1]==-1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at row "+ans[0]+" and column "+ans[1]);
        

    }
}
