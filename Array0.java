import java.util.Scanner;

public class Array0 {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter number of elements in array: ");
      //  int n= sc.nextInt();
       int []arr ={5,0,9,8,7,6};

      //  for(int i=0; i<n ;i++)
      //  {
      //   arr[i]=sc.nextInt();
      //  }
       int i=0;
       int j=4;
       display(arr, i,j);
       reverse(arr,i,j);
      reverseArray(arr);
       display(arr, arr.length);
       reverseArray(arr, 0, 3);
       display(arr, arr.length);
       reverseArray(arr, i, j);
       System.out.println(sum(arr, i,j));
    }

    public static void reverseArray(int[] arr)
    {
      int[] nums = new int[arr.length];
      for(int i=0;i<=arr.length-1;i++)
      {
        nums[i] = arr[arr.length-1-i];
      }
      
      for(int k=0; k<=arr.length-1; k++ )
      {
        arr[k] = nums[k];
      }

    }


    public static void reverseArray(int[] arr, int a, int b)
    {
      int[] nums = new int[b+1];
      for(int i=0;i<=nums.length-1;i++)
      {
        nums[i] = arr[b-i];
      }
      
      for(int k=0; k<=nums.length-1; k++ )
      {
        arr[k] = nums[k];
      }

    }

    public static int sum(int[] arr, int i, int j)
    {
      int sum=0;
      for(int r=i; r<=j;r++)
      {
        sum+=arr[r];
      }
      return sum;
    }

    public static void reverse(int[] arr,int i, int j)
    {
      while(i<j)
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
        i++;
        j--;
      }
    }

    public static void display(int[] arr, int i, int j )
    {
      for(i=0; i<j || i<arr.length; i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }

    public static void display(int[] arr, int n)
    {
      for(int i=0; i<n; i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
}
