package loveBabber;


//Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array.
//        Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
//
//        Note: Retun the index of Equilibrium point. (1-based index)
//        Example 1:
//        Input:
//        n = 5
//        A[] = {1,3,5,2,2}
//        Output: 3
//        Explanation: For second test case
//        equilibrium point is at position 3
//        as elements before it (1+3) =
//        elements after it (2+2).

public class EquilibriumPiont {
    public static int equilibriumPoint(long arr[], int n) {
        if(n==1){
            return 1;
        }
        long sum =0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }
        long lsum=0;
        for(int i =1;i<n;i++){
            lsum +=arr[i-1];
            if(lsum==(sum-(arr[i]+lsum ))){
                return i+1;
            }
        }
        return -1;
    }
}
