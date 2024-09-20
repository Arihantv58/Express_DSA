public class Binary_search_space {

    public static int help(int speed, int time)
    {
        return time*speed;
    }

    public static int minSpeed(int low, int high, int time, int dist)
    {
        int res=0;
        int mid;
        while(low<high)
        {
            mid = (high+low)/2;
            if(help(mid, time)>=dist)
            {
                res = mid;
                high=mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int dist = 100;
        int high = 200;
        int time = 2;
        int low = 0;
        System.out.println(minSpeed(low, high,time,dist));

    }
}
