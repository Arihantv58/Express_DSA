package Sliding_Window;

public class Substring_abc {
    public static int numberOfSubstrings(String s) {
        char[] ch = s.toCharArray();
        int[] abc = new int[3];
        for(int i=0; i<3; i++)
            abc[i] = -1;

        int i=0, count=0;
        while(i<s.length()){
            abc[ch[i]-'a'] = i;
            int min = Integer.MAX_VALUE;
            for(int j=0; j<3; j++)
                min = Math.min(min, abc[j]);
            count += (min+1);
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
}
