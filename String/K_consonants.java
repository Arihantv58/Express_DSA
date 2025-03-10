package String;

import java.util.HashMap;
import java.util.Map;

public class K_consonants {
    public static boolean isVowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
    public static long countOfSubstrings(String word, int k) {
        int n = word.length();
        Map<Character, Integer> map = new HashMap<>();
        int[] nextConst = new int[n];
        int lastConst = n;

        for(int i=n-1; i>=0; i--){
            nextConst[i] = lastConst;
            if(!isVowel(word.charAt(i))){
                lastConst = i;
            }
        }

        int i=0, j=0;
        int cons = 0;
        long ans = 0;
        while(j<n){
            char ch = word.charAt(j);
            if(isVowel(ch))
                map.put(ch, map.getOrDefault(ch,0)+1);
            else
                cons++;

            while(cons > k){
                char ch1 = word.charAt(i);
                if(isVowel(ch1)){
                    map.put(ch1, map.getOrDefault(ch1,0)-1);
                    if(map.get(ch1)==0)
                        map.remove(ch1);
                }
                else
                    cons--;
                i++;
            }

            while(i<n && map.size()==5 && cons == k){
                int idx = nextConst[j];
                ans += idx-j;
                char ch2 = word.charAt(i);
                if(isVowel(ch2)){
                    map.put(ch2, map.getOrDefault(ch2,0)-1);
                    if(map.get(ch2)==0)
                        map.remove(ch2);
                }
                else
                    cons--;
                i++;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "ieaouqqieaouqq";
        int k = 1;
        System.out.println(countOfSubstrings(str, k));
    }
}
