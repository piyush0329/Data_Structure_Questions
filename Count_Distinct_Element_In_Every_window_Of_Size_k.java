package Dsa_one;
import java.util.ArrayList;
import java.util.HashMap;

//Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.
//        Example 1:
//        Input:
//        N = 7, K = 4
//        A[] = {1,2,1,3,4,2,3}
//        Output: 3 4 4 3
//        Explanation: Window 1 of size k = 4 is
//        1 2 1 3. Number of distinct elements in
//        this window are 3.
//        Window 2 of size k = 4 is 2 1 3 4. Number
//        of distinct elements in this window are 4.
//        Window 3 of size k = 4 is 1 3 4 2. Number
//        of distinct elements in this window are 4.
//        Window 4 of size k = 4 is 3 4 2 3. Number
//        of distinct elements in this window are 3.

public class Count_Distinct_Element_In_Every_window_Of_Size_k {
   static  ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i<k;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }   
        al.add(map.size());
        for(int i =k;i<A.length;i++){
            if(map.get(A[i-k])==1){
                map.remove(A[i-k]);
            }
            else{
                map.put(A[i-k],map.get(A[i-k])-1);
            }
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            al.add(map.size());

        }
        return al;
    }

    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,2,3};
        System.out.println(countDistinct(arr,7,4));
    }
}
