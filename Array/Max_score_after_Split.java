package Array;
import java.util.*;

public class Max_score_after_Split {
    public static int maxScore(String s) {
        int n = s.length();
        int count1 = 0;

        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='1')
                count1++;
        }

        int count0 = 0;
        int ans = 0;
        for(int i=0; i<n-1;i++)
        {
            if(s.charAt(i)=='0')
                count0++;
            else
                count1--;
            ans = Math.max(ans,(count0 + count1));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxScore(str));
        sc.close();
    }
}
