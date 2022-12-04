package Dsa_one;

import java.util.ArrayList;
import java.util.HashMap;
//given an unsorted array A of size N that contains only non-negative integers,
// find a continuous sub-array which adds to a given number S.
//In case of multiple subarrays, return the subarray which comes first on moving from left to right.
//N = 5, S = 12
//        A[] = {1,2,3,7,5}
//        Output: 2 4
//        Explanation: The sum of elements
//        from 2nd position to 4th position
//        is 12.
//N = 10, S = 15
//        A[] = {1,2,3,4,5,6,7,8,9,10}
//        Output: 1 5
//        Explanation: The sum of elements
//        from 1st position to 5th position
//        is 15.



public class SubArrayWithGivernSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList <Integer> al = new ArrayList<>();
        int sum =0;
        int index =0;
        int count=0;
        for(int i=index;i<n;i++){
            sum+=arr[i];
            if(sum==s){
                al.add(index+1);
                al.add(i+1);
                count++;
                break;
            }
            if(sum>s){
                i=index++;
                sum=0;
            }
        }
        if(count != 0){
            return al;
        }
        else{
            al.add(-1);
            return al;
        }
    }
    static void subArraySum(int [] arr ,int n ,int sum){
        int currsum =0;
        int start=0;
        int end = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            currsum += arr[i];
            if(sum==currsum){
                start = 0;
                end =i;
                break;
            }
            if(map.containsKey(currsum-sum)){
                start = map.get(currsum-sum)+i;
                end = i;
            }
            map.put(currsum,i);
        }
        if(end==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(start+" "+end);
        }
    }
}
