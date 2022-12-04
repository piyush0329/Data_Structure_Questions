package loveBabber;
import java.util.Arrays;

//Given an array arr[] denoting heights of N towers and a positive integer K,
//        you have to modify the height of each tower either by increasing or decreasing them by K only once.
//        Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
//        Note: Assume that height of the tower can be negative.
//        A slight modification of the problem can be found here.
//        Example 1:
//        Input:
//        K = 2, N = 4
//        Arr[] = {1, 5, 8, 10}
//        Output:
//        5
//        Explanation:
//        The array can be modified as
//        {3, 3, 6, 8}. The difference between
//        the largest and the smallest is 8-3 = 5.
public class minimize_theHeight_1 {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int max = arr[n-1];
        int min = arr[0];
        int res = max-min;
        for(int i =1;i<n;i++){
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[i]-k,arr[0]+k);
            res = Math.min(res,max-min);
        }
        return res;
    }
}
