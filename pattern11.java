public class pattern11 {
    public static void main(String[] args) {
        int num=7;
        int r= (num/2)+1;

        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=r-i; j++)
            {
                System.out.print("*  ");
            }
            for(int j=1; j<=((2*i)-1);j++)
            {
                System.out.print("   ");
            }
            for(int j=r-1; j>=i; j--)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }

        for(int i=r-1; i>=1; i--)
        {
            for(int j=1; j<=r-i; j++)
            {
                System.out.print("*  ");
            }
            for(int j=1; j<=((2*i)-1);j++)
            {
                System.out.print("   ");
            }
            for(int j=r-1; j>=i; j--)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
