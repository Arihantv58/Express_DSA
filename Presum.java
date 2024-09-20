public class Presum {

    public static int[] presum(int[] arr)
    {
        int[] presum = new int[arr.length+1];
        for(int i=1; i<arr.length+1;i++)
        {
            presum[i]= arr[i-1] + presum[i-1];
        }
        return presum;
    }

    public static void display(int[] arr)
    {
        int n= arr.length;
      for(int i=0; i<n; i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,5,8,7,6,2,9,1,3,5,2,3,4};
        int n= arr.length;
        int[] presum = new int[n+1];
        presum= presum(arr);

        //For creating an array for Next Greatest element in right and next greatest element in left
        int[] nger = new int[n];
        int[] ngel = new int[n];
        int maxElement = -1;
        int maxElement1 = -1;

        for(int i=n-1; i>=0; i--)
        {
            //for nger
            nger[i]=maxElement;
            if(maxElement<arr[i])
            {
                maxElement=arr[i];
            }
        }

        for(int i=0; i<n; i++)
        {
            //for ngel
            ngel[i]=maxElement1;
            if(maxElement1<arr[i])
            {
                maxElement1=arr[i];
            }
        }

        System.out.print("Presum array: - ");
        display(presum);

        System.out.print("NGER array :- ");
        display(nger);

        System.out.print("NGEL array :- ");
        display(ngel);
    }
}
