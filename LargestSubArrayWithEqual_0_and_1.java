package Dsa_one;

import java.util.HashMap;

//Given an array of 0s and 1s. Find the length of the largest subarray with equal number of 0s and 1s.
//
//        Example 1:
//
//        Input:
//        N = 4
//        A[] = {0,1,0,1}
//        Output: 4
//        Explanation: The array from index [0...3]
//        contains equal number of 0's and 1's.
//        Thus maximum length of subarray having
//        equal number of 0's and 1's is 4.




public class LargestSubArrayWithEqual_0_and_1 {
    int maxLen(int[] arr, int N)
    {
        int sum =0;
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<N;i++){
            if(arr[i]==0){
                sum+=-1;
            }
            else if(arr[i]==1){
                sum +=1;
            }
            if(map.containsKey(sum)){
                //   int index = map.get(sum);
                //   int len = i-index;
                int len = i - map.get(sum);
                if(len>ans){
                    ans=len;
                }
            }
            else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}
