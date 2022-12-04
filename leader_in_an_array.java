package loveBabber;

import java.util.ArrayList;
import java.util.Collections;

//Given an array A of positive integers. Your task is to find the leaders in the array.
//        An element of array is leader if it is greater than or equal to all the elements to its right side.
//        The rightmost element is always a leader.
//        Example 1:
//        Input:
//        n = 6
//        A[] = {16,17,4,3,5,2}
//        Output: 17 5 2
//        Explanation: The first leader is 17
//        as it is greater than all the elements
//        to its right.  Similarly, the next
//        leader is 5. The right most element
//        is always a leader so it is also
//        included.
//        Example 2:
//        Input:
//        n = 5
//        A[] = {1,2,3,4,0}
//        Output: 4 0

public class leader_in_an_array {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList al = new ArrayList();
        al.add(arr[n-1]);
        int leader = arr[n-1];
        for(int i = n-2;i>=0;i--){
            if(arr[i]>=leader ){
                al.add(arr[i] );
                leader = arr[i];
            }
        }
        Collections.reverse(al);
        return al;
    }


}
