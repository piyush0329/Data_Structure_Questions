package loveBabber;
// in this we have to find the minimum number of jumps to reach at the end of an array
//Given an array of N integers arr[] where each element represents the max number of steps that can be made forward from that element.
//        Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
//
//        Note: Return -1 if you can't reach the end of the array.
//Input:
//        N = 11
//        arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
//        Output: 3
//        Explanation:
//        First jump from 1st element to 2nd
//        element with value 3. Now, from here
//        we jump to 5th element with value 9,
//        and from here we will jump to the last.

public class MinimumNumberOfJumps {
    static int minJumps(int[] arr){
        int ans =-1;
        if(arr.length ==0) return ans;
        if(arr.length==1) return 0;
        int maxRange = arr[0], step =0,jump =0;
        for(int i =0 ;i<arr.length;i++){
            step = Math.max(step,i+arr[i]);
            if(i==maxRange){
                maxRange = step;
                jump++;
            }
            if(maxRange>=arr.length-1) return jump+1;

        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
