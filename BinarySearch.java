package Dsa_one;

public class BinarySearch {
    //it is used where we have something sorted array OR if we need something in contigious fashion

    static int binarySearchIterative(int a[],int key){
        int low=0;
        int high = a.length;
        while(low<=high){
           int mid = (low+high)/2;
           if(a[mid]==key){
               return mid;
           }
           else if (a[mid]<key){
               low = mid+1;
           }
           else{
               high = mid-1;
           }
        }
        return -1;
    }
   public static int binarySearchRecursive(int a[],int key,int low,int high){
        if(low>high ) return -1;
        int mid = (low+high)/2;
        if(a[mid]==key){
            return mid;
        }
        else if(a[mid]<key){
                return binarySearchRecursive(a,key,mid+1,high);
        }
        else{
            return binarySearchRecursive(a,key,low,mid-1);
        }
    }
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 10, 40 };
        int key = 40;
        System.out.println( binarySearchRecursive(a,key,0,a.length));
        System.out.println(binarySearchIterative(a,key));
    }
}
