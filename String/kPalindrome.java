package String;
import java.util.*;

public class kPalindrome {
    public static boolean canConstruct(String s, int k) {
        int[] alpha = new int[26];
        int count = 0;
        int n = s.length();

        if(n<k)
            return false;
        for(int i=0; i<n; i++)
        {
            alpha[s.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++)
        {
            if(alpha[i]%2 != 0)
                count++;
        }
        return count <= k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(canConstruct(str,k));
        sc.close();
    }
}
