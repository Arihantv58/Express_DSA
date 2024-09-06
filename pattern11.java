public class pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int k=1; k<=(n-i-1);k++)
            {
                System.out.print("*  ");
            }
            for(int l=1; l<=i; l++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("   ");
            }
            for(int m=n-i; m>1; m--)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }

        for(int i=n;i>0;i--)
        {
            for(int k=1; k<=(n-i-1); k++)
            {
                System.out.print("*  ");
            }
            for(int l=1; l<=i; l++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("   ");
            }
            for(int m=n-i; m>1; m--)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
