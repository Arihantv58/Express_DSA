package String;

import java.util.ArrayList;
import java.util.*;

public class String_matching {
    public static List<String> stringMatching(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        int n = words.length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                    continue;
                if(words[j].contains(words[i]))
                {
                    ans.add(words[i]);
                    break;
                } 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++)
        {
            str[i] = sc.next();
        }
        List<String> ans = stringMatching(str);

        System.out.println(ans);
        sc.close();
    }
}
