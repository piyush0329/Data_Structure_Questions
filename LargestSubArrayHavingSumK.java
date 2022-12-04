package Dsa_one;

import java.util.HashMap;

public class LargestSubArrayHavingSumK {
    static int longestSubArraySumK(int []arr,int sum,int n){
        int currsum =0;
        int maxlen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum==sum){
                maxlen= i+1;
            }
            if(map.containsKey(currsum-sum)){
                int len = i- map.get(currsum-sum);
                if(maxlen<len){
                    maxlen = len;
                }
            }
            else{
                map.put(currsum,i);
            }

        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int k = 15;
        System.out.println("Length = " +  longestSubArraySumK(arr, k, n));
    }
}
