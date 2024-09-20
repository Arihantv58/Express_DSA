public class pattern8 {
    //pattern to print diamond pattern
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int k=1; k<=(n-i);k++)
            {
                System.out.print("   ");
            }
            for(int l=1; l<=i; l++)
            {
                System.out.print("*  ");
            }
            for(int j=1; j<i; j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }

        for(int i=n-1;i>0;i--)
        {
            for(int k=1; k<=(n-i); k++)
            {
                System.out.print("   ");
            }
            for(int l=1; l<=i; l++)
            {
                System.out.print("*  ");
            }
            for(int j=1; j<i; j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //
        //
        //Aproach 2
        //
        //

        int num=7;
        int r= (num/2)+1;

        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=r-i; j++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<=((2*i)-1);j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }

        for(int i=r-1; i>=1; i--)
        {
            for(int j=1; j<=r-i; j++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<=((2*i)-1);j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    
}
