public class pattern3 {
    //program for left facing inverted triangle
    public static void main(String[] args) {
        int n=5;
        for(int i=n; i>0; i--)
        {
            for(int k=1; k<=2*(n-i); k++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
