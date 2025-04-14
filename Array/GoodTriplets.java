package Array;

public class GoodTriplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;
        for(int j=1; j<n-1; j++){
            for(int i=0; i<j; i++){
                if(Math.abs(arr[i] - arr[j]) <= a){
                    for(int k=j+1; k<n; k++){
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1,1,9,7};
        int a = 7;
        int b = 2;
        int c = 3;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }
}
