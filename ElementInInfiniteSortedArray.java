package Dsa_one;

public class ElementInInfiniteSortedArray extends BinarySearch {
    //in this program we have to find an element in an array whose length is not known(infintie sorted array)
    static int infiniteSortedSearch(int a[],int key){
        int low=0;
        int high =1;
        while(a[high]<key){
            low=high;
            high=2*high;
        }
        return binarySearchRecursive(a,key,low,high);
    }
    public static void main(String[] args) {
        int a[]={ 2, 3, 4, 10, 40 ,60,80,90,100,110,120,150,345,567,890,990,8990};
        int key = 8990;
        System.out.println(infiniteSortedSearch(a,key));
    }
}
