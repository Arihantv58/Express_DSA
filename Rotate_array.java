public class Rotate_array {

    public static void rotate(int[] arr, int k)
    {
        int last = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=last;
    }

    public static void display(int[] arr, int n)
    {
      for(int i=0; i<n; i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;
        for(int i=0; i<k; i++)
        {
            rotate(arr,k);
        }
        display(arr, arr.length);
    }
}
