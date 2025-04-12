package Math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountGoodInteger {
    public static long countGoodIntegers(int n, int k) {
        Set<String> st = new HashSet<>();
        long[] fact = new long[11];
        Arrays.fill(fact,1);

        for(int i=1; i<11; i++){
            fact[i] = fact[i-1] * i;
        }

        int d = (n+1)/2;
        int start = (int)Math.pow(10, d-1);
        int end = (int)Math.pow(10,d)-1;

        for(int i=start; i<=end; i++){
            String left = Integer.toString(i);
            String full = "";

            if(n%2 ==0){
                StringBuilder right = new StringBuilder(left).reverse();
                full = left + right;
            }
            else{
                String sub = left.substring(0, d-1);
                StringBuilder right = new StringBuilder(sub).reverse();
                full = left + right;
            }
            long number = Long.valueOf(full);
            if(number % k != 0)
                continue;
            char[] chars = full.toCharArray();
            Arrays.sort(chars);
            String ans = new String(chars);
            st.add(ans);
        }

        long result = 0;
        for(String str : st){
            int[] count = new int[10];
            for(char ch : str.toCharArray()){
                count[ch - '0']++;
            }

            int digits = str.length();
            int zeros = count[0];
            int nonZeros = digits - zeros;

            long permutations = (nonZeros * fact[digits-1]);
            for(int i=0; i<10; i++){
                permutations /= fact[count[i]];
            }
            result += permutations;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 6;
        System.out.println(countGoodIntegers(n, k));
    }
}
