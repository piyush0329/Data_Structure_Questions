package Dsa_one;

public class RainWaterTrappingProblem {
    public static int maxWater(int[] arr, int n)
    {

        // To store the maximum water
        // that can be stored
        int res = 0;

        // For every element of the array
        // except first and last element
        for(int i = 1; i < n - 1; i++)
        {

            // Find maximum element on its left
            int left = arr[i];
            for(int j = 0; j < i; j++)
            {
                left = Math.max(left, arr[j]);
            }

            // Find maximum element on its right
            int right = arr[i];
            for(int j = i + 1; j < n; j++)
            {
                right = Math.max(right, arr[j]);
            }

            // Update maximum water value
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
    static int maxRainWater(int a[],int n){
        int maxWater=0;
        int left[]=new int[n];
        int right[]= new int[n];
        left[0]=a[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],a[i]);

        }
        right[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]= Math.max(right[i+1],a[i]);
        }
        for(int i=0;i<n;i++){
            maxWater+=(Math.min(left[i],right[i])-a[i]);
        }
        return maxWater;
    }

    // Driver code
    public static void main(String[] args)
    {
//        int[] arr = { 0, 1, 0, 2, 1, 0,
//                1, 3, 2, 1, 2, 1 };
//        int n = arr.length;
//
//        System.out.print(maxWater(arr,n));
        int a[]={3,1,2,4,0,1,3,2};
        System.out.println(maxRainWater(a,a.length));
    }
}
