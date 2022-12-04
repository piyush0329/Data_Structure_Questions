package Dsa_one;

public class LargestSumContigousArray {
//    static int MaxSum(int a[],int n){//WRONG METHOD
//        int maxSum=-99999999;
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//                sum= sum+a [j];
//            }
//            if(sum>maxSum){
//                maxSum=sum;
//            }
//        }
//        return maxSum;
//    }
    static int KadensMaxSum(int []a){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<a.length;i++){
            currSum=currSum+a[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    //USINGG DYNAMIC APPROACH
    static int DynamicMaxSum(int a[],int n){
        int currMax=a[0];
        int maxSoFar=a[0];
        for(int i=1;i<n;i++){
            currMax = Math.max(a[i], currMax+a[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int a[]={-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(KadensMaxSum(a));

    }
}
