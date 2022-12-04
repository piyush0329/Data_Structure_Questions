package loveBabber;

import java.util.Arrays;

// Given arrival and departure times of all trains that reach a railway station
// Find the minimum number of platforms required for the railway station so that no train is kept waiting.
// Consider that all the trains arrive on the same day and leave on the same day.
//Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other.
//At any given instance of time, same platform can not be used for both departure of a train and arrival of another train.
//In such cases, we need different platforms.
//
//
//        Example 1:
//
//        Input: n = 6
//        arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
//        dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
//        Output: 3
//        Explanation:
//        Minimum 3 platforms are required to
//        safely arrive and depart all trains.

public class minimumNumberOfPlatform {
    static int findPlatform(int arr[], int dep[], int n)
    {
        int platform = 1;
        int currPlatform=1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        // int j =0,k=1;
        // for(int i =1;i<n;i++){
        //     if(k<arr.length&&arr[k]>dep[j]){
        //       j++;k++;
        //     }
        //     else{
        //         platform++;
        //         k++;
        //     }
        // }
        // return platform;

        int i=1,j=0;
        while(i<n&&j<n){
            if(arr[i]<=dep[j]){
                currPlatform++;
                i++;
            }
            else if(arr[i]>dep[j]){
                currPlatform--;
                j++;
            }
            if(platform<currPlatform){
                platform=currPlatform;
            }
        }
        return platform;
    }

}
