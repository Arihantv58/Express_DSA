package Array;
import java.util.*;

public class len3_palindrome_subsequence {
    public static int countPalindromicSubsequence(String s) {
        HashSet<Character> st = new HashSet<>();

        for(char ch : s.toCharArray())
            st.add(ch);
        
        int ans = 0;
        for(char ch : st)
        {
            int l = -1;
            int r = -1;
            for(int i=0; i<s.length(); i++)
            {
                if(ch == s.charAt(i))
                {
                    if(l==-1)
                    {
                        l = i;
                    }
                    r = i;
                }
            }
            HashSet<Character> temp = new HashSet<>();
            for(int j=l+1; j<r; j++)
            {
                temp.add(s.charAt(j));
            }
            ans += temp.size();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countPalindromicSubsequence(str));
        sc.close();
    }
}
