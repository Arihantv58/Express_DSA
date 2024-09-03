public class pattern6 {
    //pattern to print butterfly pattern
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            for(int k=1; k<=2*(n-i);k++)
            {
                System.out.print("  ");
            }
            for(int l=1; l<=i; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n;i>0;i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            for(int k=1; k<=2*(n-i); k++)
            {
                System.out.print("  ");
            }
            for(int l=1; l<=i; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
