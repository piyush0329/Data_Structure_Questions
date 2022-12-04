package Dsa_one;

import java.util.HashMap;
//in this prob we have to find the largest sub array with sum zero & this also work for the given sum
//Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.
//
//        Example 1:
//
//        Input:
//        N = 8
//        A[] = {15,-2,2,-8,1,7,10,23}
//        Output: 5
//        Explanation: The largest subarray with
//        sum 0 will be -2 2 -8 1 7.


public class largestSubarrayWithSumZero {
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int currsum =0;
        int maxLen =0;
        for(int i =0;i<n;i++){
            currsum +=arr[i];
            if(currsum-sum==0){
                maxLen= i+1;
            }
            if(map.containsKey(currsum-sum)){
                int len = i-map.get(currsum-sum);
                if(len>maxLen){
                    maxLen=len;
                }
            }
            else{
                map.put(currsum,i);
            }

        }
        return maxLen;
    }
    int maxLen2(int arr[], int n){
        // Your code here
        int maxLen = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                int length = i - map.get(sum);
                if(length > maxLen) maxLen = length;
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
