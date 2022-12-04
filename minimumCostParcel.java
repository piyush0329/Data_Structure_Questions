import java.util.Arrays;

public class minimumCostParcel {
    static boolean isPresent(int arr[],int m){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==m){
                return true;
            }
        }
        return false;
    }
    static int findmin(int arr[],int k){
        int n = arr.length;
        int count = k-n;
        int ans= 0;
        int i=1;
        Arrays.sort(arr);
        int max = arr[n-1];
        while( count!=0){
            if(isPresent(arr,i)){
                i++;continue;
            }
            ans+=i;
            count--;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {4,5,7,1};
        int k =4;
        System.out.println(findmin(arr,k));
    }
}
