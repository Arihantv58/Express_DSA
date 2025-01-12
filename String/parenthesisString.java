package String;
import java.util.*;

public class parenthesisString {
    public static boolean canBeValid(String s, String locked) {
        int n = s.length();
        if(n % 2 != 0)
        {
            return false;
        }

        int openPare = 0;
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='(' || locked.charAt(i)=='0')
                openPare++;
            else
                openPare--;
            if(openPare < 0)
                return false;
        }

        int closePare = 0;
        for(int i=n-1; i>=0; i--)
        {
            if(s.charAt(i)==')' || locked.charAt(i)=='0')
                closePare++;
            else
                closePare--;
            if(closePare < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String locked = sc.next();
        System.out.println(canBeValid(str, locked));
        sc.close();
    }
}
